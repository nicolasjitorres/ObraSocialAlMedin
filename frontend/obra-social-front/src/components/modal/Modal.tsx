import React from "react";
import {Modal, Box, Typography } from "@mui/material";
import FormShift from "../form/formShift"; // Asegúrate de importar tu componente FormShift
import { Shift } from "../../redux/type";
import "./Modal.css"; // Importa tu archivo CSS aquí

const style = {
  position: "absolute",
  top: "50%",
  left: "50%",
  transform: "translate(-50%, -50%)",
  width: 400,
  bgcolor: "background.paper",
  border: "2px solid #000",
  boxShadow: 24,
  p: 4,
};

interface nameModal {
  name: string;
  shift?: Shift;
}

const BasicModal: React.FC<nameModal> = ({ name, shift }) => {
  const [open, setOpen] = React.useState(false);

  const handleOpen = () => setOpen(true);
  const handleClose = () => setOpen(false);
  
  return (
    <div>
       <button        
        onClick={handleOpen}
        className="add-button"
      >
        {name}
      </button>

      <Modal
        open={open}
        onClose={handleClose}
        aria-labelledby="modal-modal-title"
        aria-describedby="modal-modal-description"
      >
        <Box sx={style}>
          <Typography id="modal-modal-title" variant="h6" component="h2">
            {name}
          </Typography>
          <FormShift handleClose={handleClose} shift={shift} />
        </Box>
      </Modal>
    </div>
  );
};

export default BasicModal;
