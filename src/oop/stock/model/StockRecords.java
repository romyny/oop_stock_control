/*
 * Copyright (C) 2017 romuald.fotso
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package oop.stock.model;

import java.util.HashMap;

/**
 *
 * @author romuald.fotso
 */
public class StockRecords  extends AbstractModel{
    
    private HashMap<String, HashMap<String, Stock>> stocks;

    public StockRecords() {
    }

    public StockRecords(HashMap<String, HashMap<String, Stock>> stocks) {
        this.stocks = stocks;
    }

    public HashMap<String, HashMap<String, Stock>> getStocks() {
        return stocks;
    }

    public void setStocks(HashMap<String, HashMap<String, Stock>> stocks) {
        this.stocks = stocks;
    }
    
    
    
}
