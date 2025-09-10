package deob;

@ObfuscatedName("sf")
public class class482 {

	@ObfuscatedName("sf.af")
	public int field5314;

	@ObfuscatedName("sf.aw")
	public int field5313;

	@ObfuscatedName("sf.at")
	public int field5315;

	@ObfuscatedName("sf.ac")
	public int field5316;

	public class482() throws Throwable {
		throw new Error();
	}

	public String toString() {
		boolean var1 = true;
		int var2 = 10 - Integer.toString(this.field5314).length();
		int var3 = 10 - Integer.toString(this.field5315).length();
		int var4 = 10 - Integer.toString(this.field5313).length();
		String var5 = "          ".substring(10 - var2);
		String var6 = "          ".substring(10 - var3);
		String var7 = "          ".substring(10 - var4);
		return "    Size: " + this.field5314 + var5 + "Created: " + this.field5313 + var7 + "Total used: " + this.field5315 + var6 + "Max-In-Use: " + this.field5316;
	}
}
