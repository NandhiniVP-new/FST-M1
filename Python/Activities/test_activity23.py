import pytest

@pytest.mark.activity
def test_sum(num_list):
    #create a sum variable
    sum = 0
    #calculate the sum of hte number in the list
    for num in num_list:
        sum += num

    #assertion
    assert sum == 55
