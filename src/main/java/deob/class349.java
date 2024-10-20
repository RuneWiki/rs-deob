package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mr")
public class class349 extends AbstractQueue {

    @ObfuscatedName("mr.o")
    public class347[] field4180;

    @ObfuscatedName("mr.q")
    public Map field4181;

    @ObfuscatedName("mr.l")
    public int field4182;

    @ObfuscatedName("mr.k")
    public final Comparator field4179;

    @ObfuscatedName("mr.a")
    public int field4183;

    public class349(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class349(int arg0, Comparator arg1) {
        this.field4183 = 0;
        this.field4180 = new class347[arg0];
        this.field4181 = new HashMap();
        this.field4179 = arg1;
    }

    @ObfuscatedName("mr.o(I)V")
    public void method5701() {
        int var1 = (this.field4180.length << 1) + 1;
        this.field4180 = (class347[]) ((class347[]) Arrays.copyOf(this.field4180, var1));
    }

    public int size() {
        return this.field4182;
    }

    public boolean offer(Object arg0) {
        if (this.field4181.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4183++;
        int var2 = this.field4182;
        if (var2 >= this.field4180.length) {
            this.method5701();
        }
        this.field4182++;
        if (var2 == 0) {
            this.field4180[0] = new class347(arg0, 0);
            this.field4181.put(arg0, this.field4180[0]);
        } else {
            this.field4180[var2] = new class347(arg0, var2);
            this.field4181.put(arg0, this.field4180[var2]);
            this.method5682(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4182 == 0 ? null : this.field4180[0].field4172;
    }

    public Object poll() {
        if (this.field4182 == 0) {
            return null;
        }
        this.field4183++;
        Object var1 = this.field4180[0].field4172;
        this.field4181.remove(var1);
        this.field4182--;
        if (this.field4182 == 0) {
            this.field4180[this.field4182] = null;
        } else {
            this.field4180[0] = this.field4180[this.field4182];
            this.field4180[0].field4171 = 0;
            this.field4180[this.field4182] = null;
            this.method5690(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class347 var2 = (class347) this.field4181.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4183++;
        this.field4182--;
        if (this.field4182 == var2.field4171) {
            this.field4180[this.field4182] = null;
            return true;
        }
        class347 var3 = this.field4180[this.field4182];
        this.field4180[this.field4182] = null;
        this.field4180[var2.field4171] = var3;
        this.field4180[var2.field4171].field4171 = var2.field4171;
        this.method5690(var2.field4171);
        if (this.field4180[var2.field4171] == var3) {
            this.method5682(var2.field4171);
        }
        return true;
    }

    @ObfuscatedName("mr.q(II)V")
    public void method5682(int arg0) {
        class347 var2 = this.field4180[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class347 var4 = this.field4180[var3];
            if (this.field4179 == null) {
                if (((Comparable) var2.field4172).compareTo(var4.field4172) >= 0) {
                    break;
                }
            } else if (this.field4179.compare(var2.field4172, var4.field4172) >= 0) {
                break;
            }
            this.field4180[arg0] = var4;
            this.field4180[arg0].field4171 = arg0;
            arg0 = var3;
        }
        this.field4180[arg0] = var2;
        this.field4180[arg0].field4171 = arg0;
    }

    @ObfuscatedName("mr.l(II)V")
    public void method5690(int arg0) {
        class347 var2 = this.field4180[arg0];
        int var3 = this.field4182 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class347 var5 = this.field4180[var4];
            int var6 = (arg0 << 1) + 2;
            class347 var7 = this.field4180[var6];
            int var8;
            if (this.field4179 == null) {
                if (var6 < this.field4182 && ((Comparable) var5.field4172).compareTo(var7.field4172) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4182 && this.field4179.compare(var5.field4172, var7.field4172) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4179 == null) {
                if (((Comparable) var2.field4172).compareTo(this.field4180[var8].field4172) <= 0) {
                    break;
                }
            } else if (this.field4179.compare(var2.field4172, this.field4180[var8].field4172) <= 0) {
                break;
            }
            this.field4180[arg0] = this.field4180[var8];
            this.field4180[arg0].field4171 = arg0;
            arg0 = var8;
        }
        this.field4180[arg0] = var2;
        this.field4180[arg0].field4171 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4181.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4179 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4179);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class348(this);
    }
}
