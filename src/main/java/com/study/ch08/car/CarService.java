package com.study.ch08.car;

public class CarService {
    final CarRepository carRepository;

    CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    boolean isFull() {
//        int emptyCount = 0;
//        for(int i = 0; i < carRepository.cars.length; i++) {
//            if(carRepository.cars[i] == null) {
//                emptyCount++;
//            }
//        }
        return carRepository.getEmptyIndex() == -1;
    }

    void append(Car car) {
        carRepository.insert(car);
    }

    void printCarList() {
        Car[] cars = carRepository.getCarDatas();
        if(cars.length == 0) {
            System.out.println("등록된 차량이 없습니다.");
            return;
        }
        for(int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toString());
        }
    }

}
