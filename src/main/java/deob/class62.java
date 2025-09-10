package deob;

@ObfuscatedName("ce")
public class class62 {

	@ObfuscatedName("ce.aw")
	public final class410 field860;

	@ObfuscatedName("ce.at")
	public final int field865;

	@ObfuscatedName("ce.ac")
	public int field862 = 0;

	public class62(class410 arg0, String arg1) {
		this.field860 = arg0;
		this.field865 = arg0.method7700();
	}

	@ObfuscatedName("ce.af(I)Z")
	public boolean method2055() {
		this.field862 = 0;
		for (int var1 = 0; var1 < this.field865; var1++) {
			if (!this.field860.method7656(var1) || this.field860.method7655(var1)) {
				this.field862++;
			}
		}
		return this.field862 >= this.field865;
	}
}
