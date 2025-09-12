import pytest

@pytest.mark.activity
def test_addition():
     #input
    num1 = 20
    num2 = 30
    #addition
    sum = num1 + num2
    #assertion 
    assert sum == 50

@pytest.mark.activity
def test_subtraction():
     #input
    num1 = 20
    num2 = 10
    #subtract
    sub = num1 - num2
    #assertion 
    assert sub == 10

@pytest.mark.activity
def test_multiplication():
    #input
    num1 = 20
    num2 = 40
    #multiplication
    mul = num1 * num2
    #assertion 
    assert mul == 800

@pytest.mark.activity
def test_division():
    #input
    num1 = 40
    num2 = 20
    #division
    div = num1 / num2
    #assertion 
    assert div == 2
