import pytest

@pytest.mark.activity 
@pytest.mark.parametrize( "earned, spent, expected" , [(30, 10, 20,),(20, 2, 18)]) 
def test_balance (wallet_amount, earned, spent, expected): 
# Add the earned amount to the wallet 
    wallet_amount += earned 
# Subtract the spent amount from the wallet 
    wallet_amount -= spent 
# Assert the remaining balance 
    assert wallet_amount == expected 