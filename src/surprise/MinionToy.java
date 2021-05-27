package surprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {
	
	private String name;
	private static ArrayList<String> minionNames =  new ArrayList<String>(Arrays.asList("Dave", "Carl", "Kevin", "Stuart", "Jerry", "Tim"));
	private static int cnt;
	
	public MinionToy(String name) {
		this.name = name;
	}
	
	@Override
	public void enjoy() {
		System.out.println("Ai primit un minion pe nume " + this.name);
	}
	
	@Override
	public String toString() {
		return "Minionul oferit este: " + this.name + "";
	}
	
	public static MinionToy generate() {
		if (MinionToy.cnt == MinionToy.minionNames.size()) {
			MinionToy.cnt = 0;
		}
		return new MinionToy(minionNames.get(MinionToy.cnt++));
	}
}
