package dto.mappers;

import dto.AffiliateDTO;
import dto.ScheduleDTO;
import dto.ShiftDTO;
import dto.SpecialistDTO;
import model.Affiliate;
import model.Schedule;
import model.Shift;
import model.Specialist;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Mapper
{
    public static ScheduleDTO toScheduleDTO(Schedule schedule)
    {
        return new ScheduleDTO(schedule.getId(), schedule.getStartTime(), schedule.getEndTime(), schedule.getDayOfWeek(), schedule.getSpecialist().getId());
    }

    public static AffiliateDTO toAffiliateDTO(Affiliate affiliate)
    {
        return new AffiliateDTO(affiliate.getId(), affiliate.getFirstName(), affiliate.getLastName(), affiliate.getDni(), affiliate.getHealthInsuranceCode(), affiliate.getEmail());
    }
    public static List<AffiliateDTO> toAffiliateDTOList(List<Affiliate> affiliateList) {
        return affiliateList.stream()
                .map(Mapper::toAffiliateDTO)
                .collect(Collectors.toList());
    }

    public static ShiftDTO toShiftDTO(Shift shift)
    {
        return new ShiftDTO(shift.getId(), shift.getDescription(), shift.getDate(),shift.getTime(),shift.getSpecialist().getId(),shift.getAffiliate().getId());
    }

    public static List<ShiftDTO> toShiftDTOList(List<Shift> shiftList) {
        List<ShiftDTO> shiftsDTO = new ArrayList<>();
        for (Shift shift : shiftList) {
            shiftsDTO.add(toShiftDTO(shift));
        }
        return shiftsDTO;
    }
    public static SpecialistDTO toSpecialistDTO(Specialist specialist)
    {
    return new SpecialistDTO(specialist.getId(),specialist.getFirstName(),specialist.getLastName(),specialist.getDni(),specialist.getSpeciality(),specialist.getLocation(),specialist.getRole(),specialist.getEmail());
    }
    public static List<SpecialistDTO> toSpecialistDTOList(List<Specialist> specialistsList) {
        List<SpecialistDTO> specialistDTOS = new ArrayList<>();
        for (Specialist specialist : specialistsList) {
            specialistDTOS.add(toSpecialistDTO(specialist));
        }
        return specialistDTOS;
    }

}
