package deob;

import java.util.Collection;
import java.util.Iterator;

@ObfuscatedName("qn")
public class class439 implements Iterable, Collection {

	@ObfuscatedName("qn.af")
	public class545 field5128 = new class545();

	@ObfuscatedName("qn.aw")
	public class545 field5129;

	public class439() {
		this.field5128.field5600 = this.field5128;
		this.field5128.field5599 = this.field5128;
	}

	@ObfuscatedName("qn.af(Luk;Luk;)V")
	public static void method8081(class545 arg0, class545 arg1) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = arg1;
		arg0.field5600 = arg1.field5600;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qn.aw()V")
	public void method8082() {
		while (this.field5128.field5600 != this.field5128) {
			this.field5128.field5600.method2234();
		}
	}

	@ObfuscatedName("qn.at(Luk;)V")
	public void method8093(class545 arg0) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = this.field5128.field5599;
		arg0.field5600 = this.field5128;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qn.ac(Luk;)V")
	public void method8083(class545 arg0) {
		if (arg0.field5599 != null) {
			arg0.method2234();
		}
		arg0.field5599 = this.field5128;
		arg0.field5600 = this.field5128.field5600;
		arg0.field5599.field5600 = arg0;
		arg0.field5600.field5599 = arg0;
	}

	@ObfuscatedName("qn.ap()Luk;")
	public class545 method8092() {
		return this.method8117(null);
	}

	@ObfuscatedName("qn.aq(Luk;)Luk;")
	public class545 method8117(class545 arg0) {
		class545 var2;
		if (arg0 == null) {
			var2 = this.field5128.field5600;
		} else {
			var2 = arg0;
		}
		if (this.field5128 == var2) {
			this.field5129 = null;
			return null;
		} else {
			this.field5129 = var2.field5600;
			return var2;
		}
	}

	@ObfuscatedName("qn.ao()Luk;")
	public class545 method8106() {
		class545 var1 = this.field5129;
		if (this.field5128 == var1) {
			this.field5129 = null;
			return null;
		} else {
			this.field5129 = var1.field5600;
			return var1;
		}
	}

	@ObfuscatedName("qn.as()I")
	public int method8098() {
		int var1 = 0;
		for (class545 var2 = this.field5128.field5600; var2 != this.field5128; var2 = var2.field5600) {
			var1++;
		}
		return var1;
	}

	@ObfuscatedName("qn.al()Z")
	public boolean method8087() {
		return this.field5128.field5600 == this.field5128;
	}

	@ObfuscatedName("qn.au()[Luk;")
	public class545[] method8088() {
		class545[] var1 = new class545[this.method8098()];
		int var2 = 0;
		for (class545 var3 = this.field5128.field5600; var3 != this.field5128; var3 = var3.field5600) {
			var1[var2++] = var3;
		}
		return var1;
	}

	public Iterator iterator() {
		return new class438(this);
	}

	public int size() {
		return this.method8098();
	}

	public boolean isEmpty() {
		return this.method8087();
	}

	public boolean contains(Object arg0) {
		throw new RuntimeException();
	}

	public Object[] toArray() {
		return this.method8088();
	}

	public Object[] toArray(Object[] arg0) {
		int var2 = 0;
		for (class545 var3 = this.field5128.field5600; var3 != this.field5128; var3 = var3.field5600) {
			arg0[var2++] = var3;
		}
		return arg0;
	}

	@ObfuscatedName("qn.ai(Luk;)Z")
	public boolean method8096(class545 arg0) {
		this.method8093(arg0);
		return true;
	}

	public boolean remove(Object arg0) {
		throw new RuntimeException();
	}

	public boolean containsAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean addAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean removeAll(Collection arg0) {
		throw new RuntimeException();
	}

	public boolean retainAll(Collection arg0) {
		throw new RuntimeException();
	}

	public void clear() {
		this.method8082();
	}

	public boolean add(Object arg0) {
		return this.method8096((class545) arg0);
	}

	public boolean equals(Object arg0) {
		return super.equals(arg0);
	}

	public int hashCode() {
		return super.hashCode();
	}
}
