package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ry")
public class class461 extends AbstractQueue {

	@ObfuscatedName("ry.af")
	public final Comparator field5218;

	@ObfuscatedName("ry.aw")
	public class459[] field5219;

	@ObfuscatedName("ry.at")
	public Map field5214;

	@ObfuscatedName("ry.ac")
	public int field5217;

	@ObfuscatedName("ry.ap")
	public int field5215;

	public class461(int arg0) {
		this(arg0, (Comparator) null);
	}

	public class461(int arg0, Comparator arg1) {
		this.field5215 = 0;
		this.field5219 = new class459[arg0];
		this.field5214 = new HashMap();
		this.field5218 = arg1;
	}

	@ObfuscatedName("ry.af(I)V")
	public void method8568() {
		int var1 = (this.field5219.length << 1) + 1;
		this.field5219 = (class459[]) Arrays.copyOf(this.field5219, var1);
	}

	public int size() {
		return this.field5217;
	}

	public boolean offer(Object arg0) {
		if (this.field5214.containsKey(arg0)) {
			throw new IllegalArgumentException("");
		}
		this.field5215++;
		int var2 = this.field5217;
		if (var2 >= this.field5219.length) {
			this.method8568();
		}
		this.field5217++;
		if (var2 == 0) {
			this.field5219[0] = new class459(arg0, 0);
			this.field5214.put(arg0, this.field5219[0]);
		} else {
			this.field5219[var2] = new class459(arg0, var2);
			this.field5214.put(arg0, this.field5219[var2]);
			this.method8590(var2);
		}
		return true;
	}

	public Object peek() {
		return this.field5217 == 0 ? null : this.field5219[0].field5207;
	}

	public Object poll() {
		if (this.field5217 == 0) {
			return null;
		}
		this.field5215++;
		Object var1 = this.field5219[0].field5207;
		this.field5214.remove(var1);
		this.field5217--;
		if (this.field5217 == 0) {
			this.field5219[this.field5217] = null;
		} else {
			this.field5219[0] = this.field5219[this.field5217];
			this.field5219[0].field5206 = 0;
			this.field5219[this.field5217] = null;
			this.method8571(0);
		}
		return var1;
	}

	public boolean remove(Object arg0) {
		class459 var2 = (class459) this.field5214.remove(arg0);
		if (var2 == null) {
			return false;
		}
		this.field5215++;
		this.field5217--;
		if (this.field5217 == var2.field5206) {
			this.field5219[this.field5217] = null;
			return true;
		}
		class459 var3 = this.field5219[this.field5217];
		this.field5219[this.field5217] = null;
		this.field5219[var2.field5206] = var3;
		this.field5219[var2.field5206].field5206 = var2.field5206;
		this.method8571(var2.field5206);
		if (this.field5219[var2.field5206] == var3) {
			this.method8590(var2.field5206);
		}
		return true;
	}

	@ObfuscatedName("ry.aw(II)V")
	public void method8590(int arg0) {
		class459 var2 = this.field5219[arg0];
		while (arg0 > 0) {
			int var3 = arg0 - 1 >>> 1;
			class459 var4 = this.field5219[var3];
			if (this.field5218 == null) {
				if (((Comparable) var2.field5207).compareTo(var4.field5207) >= 0) {
					break;
				}
			} else if (this.field5218.compare(var2.field5207, var4.field5207) >= 0) {
				break;
			}
			this.field5219[arg0] = var4;
			this.field5219[arg0].field5206 = arg0;
			arg0 = var3;
		}
		this.field5219[arg0] = var2;
		this.field5219[arg0].field5206 = arg0;
	}

	@ObfuscatedName("ry.at(II)V")
	public void method8571(int arg0) {
		class459 var2 = this.field5219[arg0];
		int var3 = this.field5217 >>> 1;
		while (arg0 < var3) {
			int var4 = (arg0 << 1) + 1;
			class459 var5 = this.field5219[var4];
			int var6 = (arg0 << 1) + 2;
			class459 var7 = this.field5219[var6];
			int var8;
			if (this.field5218 == null) {
				if (var6 < this.field5217 && ((Comparable) var5.field5207).compareTo(var7.field5207) > 0) {
					var8 = var6;
				} else {
					var8 = var4;
				}
			} else if (var6 < this.field5217 && this.field5218.compare(var5.field5207, var7.field5207) > 0) {
				var8 = var6;
			} else {
				var8 = var4;
			}
			if (this.field5218 == null) {
				if (((Comparable) var2.field5207).compareTo(this.field5219[var8].field5207) <= 0) {
					break;
				}
			} else if (this.field5218.compare(var2.field5207, this.field5219[var8].field5207) <= 0) {
				break;
			}
			this.field5219[arg0] = this.field5219[var8];
			this.field5219[arg0].field5206 = arg0;
			arg0 = var8;
		}
		this.field5219[arg0] = var2;
		this.field5219[arg0].field5206 = arg0;
	}

	public boolean contains(Object arg0) {
		return this.field5214.containsKey(arg0);
	}

	public Object[] toArray() {
		Object[] var1 = super.toArray();
		if (this.field5218 == null) {
			Arrays.sort(var1);
		} else {
			Arrays.sort(var1, this.field5218);
		}
		return var1;
	}

	public Iterator iterator() {
		return new class460(this);
	}
}
