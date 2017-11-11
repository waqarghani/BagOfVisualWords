package Active.base.Util;

import Active.base.bean.Sequence;

public class IDCounter {
	private BaseConnect B1;
	
	public Long CountIs(String CollectionName){
		this.B1 = new BaseConnect();
		    @SuppressWarnings("deprecation")
			Sequence seq = B1.getDatastore().findAndModify(
		    		B1.getDatastore().find(Sequence.class, "Key = ", CollectionName), // query
		    		B1.getDatastore().createUpdateOperations(Sequence.class).inc("Counter") // update
		    );

		    // create a sequence record for your collection if not found
		    if(seq == null) {
		        seq = new Sequence(CollectionName);
		        B1.getDatastore().save(seq);
		    }

		    return seq.getCounter();
		}
	}


