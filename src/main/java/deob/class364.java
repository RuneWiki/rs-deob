package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("md")
public class class364 extends AbstractQueue {

    @ObfuscatedName("md.a")
    public class362[] field4326;

    @ObfuscatedName("md.f")
    public Map field4321;

    @ObfuscatedName("md.c")
    public int field4323;

    @ObfuscatedName("md.x")
    public final Comparator field4324;

    @ObfuscatedName("md.h")
    public int field4325;

    public class364(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class364(int arg0, Comparator arg1) {
        this.field4325 = 0;
        this.field4326 = new class362[arg0];
        this.field4321 = new HashMap();
        this.field4324 = arg1;
    }

    @ObfuscatedName("md.a(I)V")
    public void method6268() {
        int var1 = (this.field4326.length << 1) + 1;
        this.field4326 = (class362[]) ((class362[]) Arrays.copyOf(this.field4326, var1));
    }

    public int size() {
        return this.field4323;
    }

    public boolean offer(Object arg0) {
        if (this.field4321.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4325++;
        int var2 = this.field4323;
        if (var2 >= this.field4326.length) {
            this.method6268();
        }
        this.field4323++;
        if (var2 == 0) {
            this.field4326[0] = new class362(arg0, 0);
            this.field4321.put(arg0, this.field4326[0]);
        } else {
            this.field4326[var2] = new class362(arg0, var2);
            this.field4321.put(arg0, this.field4326[var2]);
            this.method6274(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4323 == 0 ? null : this.field4326[0].field4311;
    }

    public Object poll() {
        if (this.field4323 == 0) {
            return null;
        }
        this.field4325++;
        Object var1 = this.field4326[0].field4311;
        this.field4321.remove(var1);
        this.field4323--;
        if (this.field4323 == 0) {
            this.field4326[this.field4323] = null;
        } else {
            this.field4326[0] = this.field4326[this.field4323];
            this.field4326[0].field4312 = 0;
            this.field4326[this.field4323] = null;
            this.method6270(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class362 var2 = (class362) this.field4321.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4325++;
        this.field4323--;
        if (this.field4323 == var2.field4312) {
            this.field4326[this.field4323] = null;
            return true;
        }
        class362 var3 = this.field4326[this.field4323];
        this.field4326[this.field4323] = null;
        this.field4326[var2.field4312] = var3;
        this.field4326[var2.field4312].field4312 = var2.field4312;
        this.method6270(var2.field4312);
        if (this.field4326[var2.field4312] == var3) {
            this.method6274(var2.field4312);
        }
        return true;
    }

    @ObfuscatedName("md.f(II)V")
    public void method6274(int arg0) {
        class362 var2 = this.field4326[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class362 var4 = this.field4326[var3];
            if (this.field4324 == null) {
                if (((Comparable) var2.field4311).compareTo(var4.field4311) >= 0) {
                    break;
                }
            } else if (this.field4324.compare(var2.field4311, var4.field4311) >= 0) {
                break;
            }
            this.field4326[arg0] = var4;
            this.field4326[arg0].field4312 = arg0;
            arg0 = var3;
        }
        this.field4326[arg0] = var2;
        this.field4326[arg0].field4312 = arg0;
    }

    @ObfuscatedName("md.c(II)V")
    public void method6270(int arg0) {
        class362 var2 = this.field4326[arg0];
        int var3 = this.field4323 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class362 var5 = this.field4326[var4];
            int var6 = (arg0 << 1) + 2;
            class362 var7 = this.field4326[var6];
            int var8;
            if (this.field4324 == null) {
                if (var6 < this.field4323 && ((Comparable) var5.field4311).compareTo(var7.field4311) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4323 && this.field4324.compare(var5.field4311, var7.field4311) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4324 == null) {
                if (((Comparable) var2.field4311).compareTo(this.field4326[var8].field4311) <= 0) {
                    break;
                }
            } else if (this.field4324.compare(var2.field4311, this.field4326[var8].field4311) <= 0) {
                break;
            }
            this.field4326[arg0] = this.field4326[var8];
            this.field4326[arg0].field4312 = arg0;
            arg0 = var8;
        }
        this.field4326[arg0] = var2;
        this.field4326[arg0].field4312 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4321.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4324 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4324);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class363(this);
    }
}
