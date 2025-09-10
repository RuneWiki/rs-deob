package deob;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("as")
public class class8 {

	@ObfuscatedName("as.af")
	public final class591 field22;

	@ObfuscatedName("as.aw")
	public final class4 field20;

	@ObfuscatedName("as.at")
	public ExecutorService field25 = Executors.newSingleThreadExecutor();

	@ObfuscatedName("as.ac")
	public Future field23;

	public class8(class591 arg0, class4 arg1) {
		this.field22 = arg0;
		this.field20 = arg1;
		this.method41();
	}

	@ObfuscatedName("as.af(B)Z")
	public boolean method40() {
		return this.field23.isDone();
	}

	@ObfuscatedName("as.aw(S)V")
	public void method49() {
		this.field25.shutdown();
		this.field25 = null;
	}

	@ObfuscatedName("as.at(I)Lwb;")
	public class591 method51() {
		try {
			return (class591) this.field23.get();
		} catch (Exception var2) {
			return null;
		}
	}

	@ObfuscatedName("as.ac(S)V")
	public void method41() {
		this.field23 = this.field25.submit(new class2(this, this.field22, this.field20));
	}
}
