package com.api.parkingcontrol.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.UUID;
import java.time.LocalDateTime;


@Entity// Tipo de classe que define o ParkSpot como Entidade
@Table(name = "TB_PARKING_SPOT") // Tipo de classe que gera uma tabela com esse nome
public class ParkingSpotModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id //Classe Identificador da Entidade
    @GeneratedValue(strategy = GenerationType.AUTO) //Ao enviar os dados, ele gera automaticamente e registra o Id
    private UUID id; //Tipo de Id

    //Dados (ou Column, no BD) e seus possíveis recebimentos.

    //Número da Vaga
    @Column(nullable = false, unique = true, length = 10)// parkingSpotNumber não pode ser vazia, é uma numeração única e tem 10 caracteres 
    private String parkingSpotNumber;

    //Número da Placa do Carro
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;

    //Marca do Carro
    @Column(nullable = false, length = 70)
    private String brandCar;

    //Modelo do Carro
    @Column(nullable = false, length = 70)
    private String modelCar;

    //Cor do Carro
    @Column(nullable = false, length = 70)
    private String colorCar;
    
    //Data de Registro
    @Column(nullable = false)
    private LocalDateTime registrationDate;

    //Nome do Proprietário do Veículo
    @Column(nullable = false, length = 130)
    private String responsibleName;

    //Número do Apartamento
    @Column(nullable = false, length = 30)
    private String apartament;

    //Número/Nome do Bloco
    @Column(nullable = false, length = 30)
    private String block;
    
    //Métodos Get e Set
    

      //ID
    public UUID getId()
      { return id; }
    public void setId(UUID id)
      { this.id = id; }

      //ParkingSpotNumber
    public String getParkingSpotNumber()
      { return parkingSpotNumber; }
    public void setParkingSpotNumber(String parkingSpotNumber)
      { this.parkingSpotNumber = parkingSpotNumber; }

      //ParkingSpotNumber
    public String getLicensePlateCar()
      { return licensePlateCar; }
    public void setLicensePlateCar(String licensePlateCar)
      { this.licensePlateCar = licensePlateCar; }
      
      //BrandCar
    public String getBrandCar()
      { return brandCar; }
    public void setBrandCar(String brandCar)
      { this.brandCar = brandCar; }

      //ModelCar
    public String getModelCar()
      { return modelCar; }
    public void setModelCar(String modelCar)
      { this.modelCar = modelCar; }

      //ColorCar
    public String getColorCar()
      { return colorCar; }
    public void setColorCar(String colorCar)
      { this.colorCar = colorCar; }
    
      //RegistrationDate
    public LocalDateTime getRegistrationDate()
      { return registrationDate; }
    public void setRegistrationDate(LocalDateTime registrationDate)
      { this.registrationDate = registrationDate; }
    
      //ResponsibleName
    public String getResponsibleName()
      { return responsibleName; }
    public void setResponsibleName(String responsibleName)
      { this.responsibleName = responsibleName; }
    
      //Apartament
    public String getApartament()
      { return apartament; }
    public void setApartament(String apartament)
      { this.apartament = apartament; }
    
      //ParkingSpotNumber
    public String getBlock()
      { return block; }
    public void setBlock(String block)
      { this.block = block; }

}
