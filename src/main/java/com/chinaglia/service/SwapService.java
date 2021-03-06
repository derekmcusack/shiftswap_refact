package com.chinaglia.service;

import java.util.List;

import com.chinaglia.model.SwapOrig;

public interface SwapService {

	public void saveSwap(SwapOrig swapRequest);
	public List<SwapOrig> listAllSwaps();
	public void saveShiftSwap(SwapOrig swapOrig, String emailToSendTo);
	public SwapOrig getSwapOrigById(int id);
	
}
