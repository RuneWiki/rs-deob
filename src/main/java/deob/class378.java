package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("oe")
public class class378 extends AbstractQueue {

    @ObfuscatedName("oe.af")
    public class376[] field4402;

    @ObfuscatedName("oe.an")
    public Map field4400;

    @ObfuscatedName("oe.aw")
    public int field4404;

    @ObfuscatedName("oe.ac")
    public final Comparator field4403;

    @ObfuscatedName("oe.au")
    public int field4401;

    public class378(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class378(int arg0, Comparator arg1) {
        this.field4401 = 0;
        this.field4402 = new class376[arg0];
        this.field4400 = new HashMap();
        this.field4403 = arg1;
    }

    @ObfuscatedName("oe.af(B)V")
    public void method6603() {
        int var1 = (this.field4402.length << 1) + 1;
        this.field4402 = (class376[]) ((class376[]) Arrays.copyOf(this.field4402, var1));
    }

    public int size() {
        return this.field4404;
    }

    public boolean offer(Object arg0) {
        if (this.field4400.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4401++;
        int var2 = this.field4404;
        if (var2 >= this.field4402.length) {
            this.method6603();
        }
        this.field4404++;
        if (var2 == 0) {
            this.field4402[0] = new class376(arg0, 0);
            this.field4400.put(arg0, this.field4402[0]);
        } else {
            this.field4402[var2] = new class376(arg0, var2);
            this.field4400.put(arg0, this.field4402[var2]);
            this.method6578(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4404 == 0 ? null : this.field4402[0].field4390;
    }

    public Object poll() {
        if (this.field4404 == 0) {
            return null;
        }
        this.field4401++;
        Object var1 = this.field4402[0].field4390;
        this.field4400.remove(var1);
        this.field4404--;
        if (this.field4404 == 0) {
            this.field4402[this.field4404] = null;
        } else {
            this.field4402[0] = this.field4402[this.field4404];
            this.field4402[0].field4391 = 0;
            this.field4402[this.field4404] = null;
            this.method6579(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class376 var2 = (class376) this.field4400.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4401++;
        this.field4404--;
        if (this.field4404 == var2.field4391) {
            this.field4402[this.field4404] = null;
            return true;
        }
        class376 var3 = this.field4402[this.field4404];
        this.field4402[this.field4404] = null;
        this.field4402[var2.field4391] = var3;
        this.field4402[var2.field4391].field4391 = var2.field4391;
        this.method6579(var2.field4391);
        if (this.field4402[var2.field4391] == var3) {
            this.method6578(var2.field4391);
        }
        return true;
    }

    @ObfuscatedName("oe.an(IB)V")
    public void method6578(int arg0) {
        class376 var2 = this.field4402[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class376 var4 = this.field4402[var3];
            if (this.field4403 == null) {
                if (((Comparable) var2.field4390).compareTo(var4.field4390) >= 0) {
                    break;
                }
            } else if (this.field4403.compare(var2.field4390, var4.field4390) >= 0) {
                break;
            }
            this.field4402[arg0] = var4;
            this.field4402[arg0].field4391 = arg0;
            arg0 = var3;
        }
        this.field4402[arg0] = var2;
        this.field4402[arg0].field4391 = arg0;
    }

    @ObfuscatedName("oe.aw(IB)V")
    public void method6579(int arg0) {
        class376 var2 = this.field4402[arg0];
        int var3 = this.field4404 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class376 var5 = this.field4402[var4];
            int var6 = (arg0 << 1) + 2;
            class376 var7 = this.field4402[var6];
            int var8;
            if (this.field4403 == null) {
                if (var6 < this.field4404 && ((Comparable) var5.field4390).compareTo(var7.field4390) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4404 && this.field4403.compare(var5.field4390, var7.field4390) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4403 == null) {
                if (((Comparable) var2.field4390).compareTo(this.field4402[var8].field4390) <= 0) {
                    break;
                }
            } else if (this.field4403.compare(var2.field4390, this.field4402[var8].field4390) <= 0) {
                break;
            }
            this.field4402[arg0] = this.field4402[var8];
            this.field4402[arg0].field4391 = arg0;
            arg0 = var8;
        }
        this.field4402[arg0] = var2;
        this.field4402[arg0].field4391 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4400.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4403 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4403);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class377(this);
    }
}
