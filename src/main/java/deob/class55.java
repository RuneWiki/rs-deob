package deob;

import java.security.SecureRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

@ObfuscatedName("cf")
public class class55 {

	@ObfuscatedName("cf.af")
	public ExecutorService field792 = Executors.newSingleThreadExecutor();

	@ObfuscatedName("cf.aw")
	public Future field793 = this.field792.submit(new class61());

	@ObfuscatedName("cf.af(I)V")
	public void method1942() {
		this.field792.shutdown();
		this.field792 = null;
	}

	@ObfuscatedName("cf.aw(I)Z")
	public boolean method1944() {
		return this.field793.isDone();
	}

	@ObfuscatedName("cf.at(I)Ljava/security/SecureRandom;")
	public SecureRandom method1945() {
		try {
			return (SecureRandom) this.field793.get();
		} catch (Exception var4) {
			SecureRandom var2 = new SecureRandom();
			var2.nextInt();
			return var2;
		}
	}
}
