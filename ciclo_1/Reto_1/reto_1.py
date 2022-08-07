# reto1 mintic

salarioMes, horaExtra, bonoMes = input().split()

salarioMes= float(salarioMes)
horaExtra= int(horaExtra)
bonoMes= float(bonoMes)

salarioHora = salarioMes/192

# print("Cuantas horas extras hizo?")
# horaExtra = int(input())
if horaExtra >= 1:
  horaExtras = (horaExtra * (salarioHora * 1.25))
else:
  horaExtras = (salarioHora * 0)


#print("Recibio bono el mes pasado? ingrese 0 para no y 1 para si")
#bonoMes = input()
if bonoMes == 1:
  bono = (salarioMes * 0.05)
else:
  bono = (salarioMes * 0)

salarioBruto = (salarioMes + horaExtras + bono)

#salarioBase, horasEx, bonificacion = input().split()

#Ahora vamos a calcular las deducciones

pos = (salarioBruto * 0.035)

pension = (salarioBruto * 0.04)

cajacom = (salarioBruto * 0.01)

salarioNeto = round(salarioBruto - (pos + pension + cajacom), 1)
print(salarioNeto)