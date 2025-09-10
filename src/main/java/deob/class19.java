package deob;

import java.util.concurrent.Future;

@ObfuscatedName("ag")
public class class19 {

	@ObfuscatedName("ag.af")
	public Future field70;

	@ObfuscatedName("ag.aw")
	public String field77;

	public class19(Future arg0) {
		this.field70 = arg0;
	}

	public class19(String arg0) {
		this.method285(arg0);
	}

	@ObfuscatedName("ag.af(B)Ljava/lang/String;")
	public final String method269() {
		return this.field77;
	}

	@ObfuscatedName("ag.aw(Ljava/lang/String;I)V")
	public void method285(String arg0) {
		if (arg0 == null) {
			arg0 = "";
		}
		this.field77 = arg0;
		if (this.field70 != null) {
			this.field70.cancel(true);
			this.field70 = null;
		}
	}

	@ObfuscatedName("ag.at(I)Z")
	public boolean method271() {
		return this.field77 != null || this.field70 == null;
	}

	@ObfuscatedName("ag.ac(I)Z")
	public final boolean method272() {
		return this.method271() ? true : this.field70.isDone();
	}

	@ObfuscatedName("ag.ap(I)Lah;")
	public final class21 method275() {
		if (this.method271()) {
			return new class21(this.field77);
		} else if (this.method272()) {
			try {
				return (class21) this.field70.get();
			} catch (Exception var3) {
				String var2 = "Error retrieving REST request reply";
				System.err.println(var2 + "\r\n" + var3);
				this.method285(var2);
				return new class21(var2);
			}
		} else {
			return null;
		}
	}
}
