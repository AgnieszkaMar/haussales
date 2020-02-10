package service;

import model.House;
import model.Offer;

import java.util.UUID;

interface OfferService {
    void addOffer(House house);
    Offer searchOfferByArea(int min, int max);
    Offer searchOfferByPrice(int min, int max);
    Offer searchOfferByRooms(int rooms);
    void removeOffer(UUID id);




}
