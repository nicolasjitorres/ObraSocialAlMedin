import React from 'react';
import './Button.css';

const AddSpecialistButton: React.FC = () => {
  return (
    <>
      <h2>Nuevo Especialista</h2>
      <button type="button" className="add-button">Agregar</button>
    </>
  );
};

export default AddSpecialistButton;
