package deob;

@ObfuscatedName("pa")
public class class403 {

	@ObfuscatedName("pa.af")
	public boolean field4866 = false;

	@ObfuscatedName("pa.aw")
	public long field4861 = -1L;

	@ObfuscatedName("pa.at")
	public long field4860 = -1L;

	@ObfuscatedName("pa.ac")
	public long field4858 = 0L;

	@ObfuscatedName("pa.ap")
	public long field4862 = 0L;

	@ObfuscatedName("pa.aq")
	public long field4863 = 0L;

	@ObfuscatedName("pa.ao")
	public int field4864 = 0;

	@ObfuscatedName("pa.as")
	public int field4865 = 0;

	@ObfuscatedName("pa.al")
	public int field4859 = 0;

	@ObfuscatedName("pa.au")
	public int field4867 = 0;

	@ObfuscatedName("pa.af(B)V")
	public void method7604() {
		this.field4861 = class335.method3987();
	}

	@ObfuscatedName("pa.aw(B)V")
	public void method7606() {
		if (this.field4861 != -1L) {
			this.field4862 = class335.method3987() - this.field4861;
			this.field4861 = -1L;
		}
	}

	@ObfuscatedName("pa.at(II)V")
	public void method7607(int arg0) {
		this.field4860 = class335.method3987();
		this.field4864 = arg0;
	}

	@ObfuscatedName("pa.ac(B)V")
	public void method7608() {
		if (this.field4860 != -1L) {
			this.field4858 = class335.method3987() - this.field4860;
			this.field4860 = -1L;
		}
		this.field4859++;
		this.field4866 = true;
	}

	@ObfuscatedName("pa.ap(I)V")
	public void method7611() {
		this.field4866 = false;
		this.field4865 = 0;
	}

	@ObfuscatedName("pa.aq(I)V")
	public void method7610() {
		this.method7608();
	}

	@ObfuscatedName("pa.ao(Lwb;I)V")
	public void method7622(class591 arg0) {
		long var2 = this.field4862;
		long var4 = var2 / 10L;
		if (var4 < 0L) {
			var4 = 0L;
		} else if (var4 > 65535L) {
			var4 = 65535L;
		}
		arg0.method10321((int) var4);
		long var6 = this.field4858;
		long var8 = var6 / 10L;
		if (var8 < 0L) {
			var8 = 0L;
		} else if (var8 > 65535L) {
			var8 = 65535L;
		}
		arg0.method10321((int) var8);
		long var10 = this.field4863;
		long var12 = var10 / 10L;
		if (var12 < 0L) {
			var12 = 0L;
		} else if (var12 > 65535L) {
			var12 = 65535L;
		}
		arg0.method10321((int) var12);
		arg0.method10321(this.field4864);
		arg0.method10321(this.field4865);
		arg0.method10321(this.field4859);
		arg0.method10321(this.field4867);
	}
}
