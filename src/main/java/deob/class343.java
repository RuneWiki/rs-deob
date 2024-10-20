package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mn")
public class class343 extends AbstractQueue {

    @ObfuscatedName("mn.v")
    public class341[] field4105;

    @ObfuscatedName("mn.c")
    public Map field4106;

    @ObfuscatedName("mn.i")
    public int field4107;

    @ObfuscatedName("mn.f")
    public final Comparator field4108;

    @ObfuscatedName("mn.b")
    public int field4109;

    public class343(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class343(int arg0, Comparator arg1) {
        this.field4109 = 0;
        this.field4105 = new class341[arg0];
        this.field4106 = new HashMap();
        this.field4108 = arg1;
    }

    @ObfuscatedName("mn.v(I)V")
    public void method5711() {
        int var1 = (this.field4105.length << 1) + 1;
        this.field4105 = (class341[]) ((class341[]) Arrays.copyOf(this.field4105, var1));
    }

    public int size() {
        return this.field4107;
    }

    public boolean offer(Object arg0) {
        if (this.field4106.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4109++;
        int var2 = this.field4107;
        if (var2 >= this.field4105.length) {
            this.method5711();
        }
        this.field4107++;
        if (var2 == 0) {
            this.field4105[0] = new class341(arg0, 0);
            this.field4106.put(arg0, this.field4105[0]);
        } else {
            this.field4105[var2] = new class341(arg0, var2);
            this.field4106.put(arg0, this.field4105[var2]);
            this.method5699(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4107 == 0 ? null : this.field4105[0].field4097;
    }

    public Object poll() {
        if (this.field4107 == 0) {
            return null;
        }
        this.field4109++;
        Object var1 = this.field4105[0].field4097;
        this.field4106.remove(var1);
        this.field4107--;
        if (this.field4107 == 0) {
            this.field4105[this.field4107] = null;
        } else {
            this.field4105[0] = this.field4105[this.field4107];
            this.field4105[0].field4096 = 0;
            this.field4105[this.field4107] = null;
            this.method5723(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class341 var2 = (class341) this.field4106.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4109++;
        this.field4107--;
        if (this.field4107 == var2.field4096) {
            this.field4105[this.field4107] = null;
            return true;
        }
        class341 var3 = this.field4105[this.field4107];
        this.field4105[this.field4107] = null;
        this.field4105[var2.field4096] = var3;
        this.field4105[var2.field4096].field4096 = var2.field4096;
        this.method5723(var2.field4096);
        if (this.field4105[var2.field4096] == var3) {
            this.method5699(var2.field4096);
        }
        return true;
    }

    @ObfuscatedName("mn.c(II)V")
    public void method5699(int arg0) {
        class341 var2 = this.field4105[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class341 var4 = this.field4105[var3];
            if (this.field4108 == null) {
                if (((Comparable) var2.field4097).compareTo(var4.field4097) >= 0) {
                    break;
                }
            } else if (this.field4108.compare(var2.field4097, var4.field4097) >= 0) {
                break;
            }
            this.field4105[arg0] = var4;
            this.field4105[arg0].field4096 = arg0;
            arg0 = var3;
        }
        this.field4105[arg0] = var2;
        this.field4105[arg0].field4096 = arg0;
    }

    @ObfuscatedName("mn.i(IB)V")
    public void method5723(int arg0) {
        class341 var2 = this.field4105[arg0];
        int var3 = this.field4107 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class341 var5 = this.field4105[var4];
            int var6 = (arg0 << 1) + 2;
            class341 var7 = this.field4105[var6];
            int var8;
            if (this.field4108 == null) {
                if (var6 < this.field4107 && ((Comparable) var5.field4097).compareTo(var7.field4097) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4107 && this.field4108.compare(var5.field4097, var7.field4097) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4108 == null) {
                if (((Comparable) var2.field4097).compareTo(this.field4105[var8].field4097) <= 0) {
                    break;
                }
            } else if (this.field4108.compare(var2.field4097, this.field4105[var8].field4097) <= 0) {
                break;
            }
            this.field4105[arg0] = this.field4105[var8];
            this.field4105[arg0].field4096 = arg0;
            arg0 = var8;
        }
        this.field4105[arg0] = var2;
        this.field4105[arg0].field4096 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4106.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4108 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4108);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class342(this);
    }
}
