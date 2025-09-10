package deob;

import java.util.zip.Inflater;

@ObfuscatedName("xs")
public class class613 {

	@ObfuscatedName("xs.af")
	public Inflater field6075;

	public class613() {
		this(-1, 1000000, 1000000);
	}

	public class613(int arg0, int arg1, int arg2) {
	}

	@ObfuscatedName("xs.af(Lwb;[BI)V")
	public void method11018(class591 arg0, byte[] arg1) {
		if (arg0.field5917[arg0.field5920] != 31 || arg0.field5917[arg0.field5920 + 1] != -117) {
			throw new RuntimeException("");
		}
		if (this.field6075 == null) {
			this.field6075 = new Inflater(true);
		}
		try {
			this.field6075.setInput(arg0.field5917, arg0.field5920 + 10, arg0.field5917.length - (arg0.field5920 + 10 + 8));
			this.field6075.inflate(arg1);
		} catch (Exception var4) {
			this.field6075.reset();
			throw new RuntimeException("");
		}
		this.field6075.reset();
	}
}
