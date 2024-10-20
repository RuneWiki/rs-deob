package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mh")
public class class350 extends AbstractQueue {

    @ObfuscatedName("mh.c")
    public class348[] field4213;

    @ObfuscatedName("mh.p")
    public Map field4214;

    @ObfuscatedName("mh.f")
    public int field4217;

    @ObfuscatedName("mh.n")
    public final Comparator field4216;

    @ObfuscatedName("mh.k")
    public int field4215;

    public class350(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class350(int arg0, Comparator arg1) {
        this.field4215 = 0;
        this.field4213 = new class348[arg0];
        this.field4214 = new HashMap();
        this.field4216 = arg1;
    }

    @ObfuscatedName("mh.c(B)V")
    public void method5906() {
        int var1 = (this.field4213.length << 1) + 1;
        this.field4213 = (class348[]) ((class348[]) Arrays.copyOf(this.field4213, var1));
    }

    public int size() {
        return this.field4217;
    }

    public boolean offer(Object arg0) {
        if (this.field4214.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4215++;
        int var2 = this.field4217;
        if (var2 >= this.field4213.length) {
            this.method5906();
        }
        this.field4217++;
        if (var2 == 0) {
            this.field4213[0] = new class348(arg0, 0);
            this.field4214.put(arg0, this.field4213[0]);
        } else {
            this.field4213[var2] = new class348(arg0, var2);
            this.field4214.put(arg0, this.field4213[var2]);
            this.method5908(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4217 == 0 ? null : this.field4213[0].field4205;
    }

    public Object poll() {
        if (this.field4217 == 0) {
            return null;
        }
        this.field4215++;
        Object var1 = this.field4213[0].field4205;
        this.field4214.remove(var1);
        this.field4217--;
        if (this.field4217 == 0) {
            this.field4213[this.field4217] = null;
        } else {
            this.field4213[0] = this.field4213[this.field4217];
            this.field4213[0].field4207 = 0;
            this.field4213[this.field4217] = null;
            this.method5909(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class348 var2 = (class348) this.field4214.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4215++;
        this.field4217--;
        if (this.field4217 == var2.field4207) {
            this.field4213[this.field4217] = null;
            return true;
        }
        class348 var3 = this.field4213[this.field4217];
        this.field4213[this.field4217] = null;
        this.field4213[var2.field4207] = var3;
        this.field4213[var2.field4207].field4207 = var2.field4207;
        this.method5909(var2.field4207);
        if (this.field4213[var2.field4207] == var3) {
            this.method5908(var2.field4207);
        }
        return true;
    }

    @ObfuscatedName("mh.p(II)V")
    public void method5908(int arg0) {
        class348 var2 = this.field4213[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class348 var4 = this.field4213[var3];
            if (this.field4216 == null) {
                if (((Comparable) var2.field4205).compareTo(var4.field4205) >= 0) {
                    break;
                }
            } else if (this.field4216.compare(var2.field4205, var4.field4205) >= 0) {
                break;
            }
            this.field4213[arg0] = var4;
            this.field4213[arg0].field4207 = arg0;
            arg0 = var3;
        }
        this.field4213[arg0] = var2;
        this.field4213[arg0].field4207 = arg0;
    }

    @ObfuscatedName("mh.f(IB)V")
    public void method5909(int arg0) {
        class348 var2 = this.field4213[arg0];
        int var3 = this.field4217 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class348 var5 = this.field4213[var4];
            int var6 = (arg0 << 1) + 2;
            class348 var7 = this.field4213[var6];
            int var8;
            if (this.field4216 == null) {
                if (var6 < this.field4217 && ((Comparable) var5.field4205).compareTo(var7.field4205) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4217 && this.field4216.compare(var5.field4205, var7.field4205) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4216 == null) {
                if (((Comparable) var2.field4205).compareTo(this.field4213[var8].field4205) <= 0) {
                    break;
                }
            } else if (this.field4216.compare(var2.field4205, this.field4213[var8].field4205) <= 0) {
                break;
            }
            this.field4213[arg0] = this.field4213[var8];
            this.field4213[arg0].field4207 = arg0;
            arg0 = var8;
        }
        this.field4213[arg0] = var2;
        this.field4213[arg0].field4207 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4214.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4216 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4216);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class349(this);
    }
}
