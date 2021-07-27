package ru.sma.boot;

import org.springframework.context.annotation.Import;

@Import(VehiclePartSupplier.class)
class VehicleFactoryConfig {}