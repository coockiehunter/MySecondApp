package com.example.mysecondapp

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}


fun getRandomDirection(): Direction {
    return Direction.EAST
}