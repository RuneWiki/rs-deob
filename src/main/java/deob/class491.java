package deob;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@ObfuscatedName("sj")
public class class491 {

	@ObfuscatedName("sj.af")
	public final Comparator field5364;

	@ObfuscatedName("sj.aw")
	public final Map field5357;

	@ObfuscatedName("sj.at")
	public final class461 field5359;

	@ObfuscatedName("sj.ac")
	public final class461 field5360;

	@ObfuscatedName("sj.ap")
	public final long field5361;

	@ObfuscatedName("sj.aq")
	public final class489 field5362;

	@ObfuscatedName("sj.ao")
	public final int field5363;

	public class491(int arg0, class489 arg1) {
		this(-1L, arg0, arg1);
	}

	public class491(long arg0, int arg1, class489 arg2) {
		this.field5364 = new class490(this);
		this.field5361 = arg0;
		this.field5363 = arg1;
		this.field5362 = arg2;
		if (this.field5363 == -1) {
			this.field5357 = new HashMap(64);
			this.field5359 = new class461(64, this.field5364);
			this.field5360 = null;
		} else if (this.field5362 == null) {
			throw new IllegalArgumentException("");
		} else {
			this.field5357 = new HashMap(this.field5363);
			this.field5359 = new class461(this.field5363, this.field5364);
			this.field5360 = new class461(this.field5363);
		}
	}

	@ObfuscatedName("sj.af(I)Z")
	public boolean method9133() {
		return this.field5363 != -1;
	}

	@ObfuscatedName("sj.aw(Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method9136(Object arg0) {
		synchronized (this) {
			if (this.field5361 != -1L) {
				this.method9150();
			}
			class492 var3 = (class492) this.field5357.get(arg0);
			if (var3 == null) {
				return null;
			} else {
				this.method9135(var3, false);
				return var3.field5367;
			}
		}
	}

	@ObfuscatedName("sj.at(Ljava/lang/Object;Ljava/lang/Object;I)Ljava/lang/Object;")
	public Object method9151(Object arg0, Object arg1) {
		synchronized (this) {
			if (this.field5361 != -1L) {
				this.method9150();
			}
			class492 var4 = (class492) this.field5357.get(arg0);
			if (var4 != null) {
				Object var5 = var4.field5367;
				var4.field5367 = arg1;
				this.method9135(var4, false);
				return var5;
			}
			if (this.method9133() && this.field5357.size() == this.field5363) {
				class492 var6 = (class492) this.field5360.remove();
				this.field5357.remove(var6.field5365);
				this.field5359.remove(var6);
			}
			class492 var7 = new class492(arg1, arg0);
			this.field5357.put(arg0, var7);
			this.method9135(var7, true);
			return null;
		}
	}

	@ObfuscatedName("sj.ac(Lsr;ZI)V")
	public void method9135(class492 arg0, boolean arg1) {
		if (!arg1) {
			this.field5359.remove(arg0);
			if (this.method9133() && !this.field5360.remove(arg0)) {
				throw new IllegalStateException("");
			}
		}
		arg0.field5366 = System.currentTimeMillis();
		if (this.method9133()) {
			switch(this.field5362.field5353) {
				case 0:
					arg0.field5368 = arg0.field5366;
					break;
				case 1:
					arg0.field5368++;
			}
			this.field5360.add(arg0);
		}
		this.field5359.add(arg0);
	}

	@ObfuscatedName("sj.ap(B)V")
	public void method9150() {
		if (this.field5361 == -1L) {
			throw new IllegalStateException("");
		}
		long var1 = System.currentTimeMillis() - this.field5361;
		while (!this.field5359.isEmpty()) {
			class492 var3 = (class492) this.field5359.peek();
			if (var3.field5366 >= var1) {
				return;
			}
			this.field5357.remove(var3.field5365);
			this.field5359.remove(var3);
			if (this.method9133()) {
				this.field5360.remove(var3);
			}
		}
	}

	@ObfuscatedName("sj.aq(B)V")
	public void method9137() {
		synchronized (this) {
			this.field5357.clear();
			this.field5359.clear();
			if (this.method9133()) {
				this.field5360.clear();
			}
		}
	}
}
