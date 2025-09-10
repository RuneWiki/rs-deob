package deob;

@ObfuscatedName("bo")
public class class34 {

	@ObfuscatedName("bo.ao")
	public int field171;

	@ObfuscatedName("bo.as")
	public int field172;

	public class34(int arg0, int arg1) {
		this.field171 = arg0;
		this.field172 = arg1;
	}

	@ObfuscatedName("bo.af(Lbi;I)Z")
	public boolean method495(class30 arg0) {
		if (arg0 == null) {
			return false;
		}
		switch(this.field171) {
			case 1:
				return arg0.method461(this.field172);
			case 2:
				return arg0.method450(this.field172);
			case 3:
				return arg0.method451((char) this.field172);
			case 4:
				return arg0.method452(this.field172 == 1);
			default:
				return false;
		}
	}
}
