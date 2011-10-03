package bufmgr;

import chainexception.ChainException;
import diskmgr.*;
import global.*;

public class BufMgr {
	byte bufpool[][];
	public BufMgr(int numbufs, String replacerArg){
		bufpool = new byte[GlobalConst.MINIBASE_BUFFER_POOL_SIZE][numbufs];
		
	}
	public void pinPage(PageId pin_pgid, Page page, boolean emptyPage) throws ChainException{
		throw new ChainException();
	}
	public void unpinPage(PageId PageId_in_a_DB, boolean dirty) throws ChainException{
		throw new ChainException();
	}
	public PageId newPage(Page firstpage, int howmany){
		return new PageId();
	}
	public void freePage(PageId globalPageId) throws ChainException{
		throw new ChainException();
	}
	public void flushPage(PageId pageid){
		
	}
	public int getNumUnpinnedBuffers(){
		return 0;
	}
	public int getNumBuffers() {
		return 0;
	};
}
