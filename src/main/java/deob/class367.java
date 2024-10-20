package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("nm")
public class class367 extends AbstractQueue {

    @ObfuscatedName("nm.h")
    public class365[] field4374;

    @ObfuscatedName("nm.e")
    public Map field4369;

    @ObfuscatedName("nm.v")
    public int field4370;

    @ObfuscatedName("nm.x")
    public final Comparator field4372;

    @ObfuscatedName("nm.m")
    public int field4373;

    public class367(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class367(int arg0, Comparator arg1) {
        this.field4373 = 0;
        this.field4374 = new class365[arg0];
        this.field4369 = new HashMap();
        this.field4372 = arg1;
    }

    @ObfuscatedName("nm.h(I)V")
    public void method6378() {
        int var1 = (this.field4374.length << 1) + 1;
        this.field4374 = (class365[]) ((class365[]) Arrays.copyOf(this.field4374, var1));
    }

    public int size() {
        return this.field4370;
    }

    public boolean offer(Object arg0) {
        if (this.field4369.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4373++;
        int var2 = this.field4370;
        if (var2 >= this.field4374.length) {
            this.method6378();
        }
        this.field4370++;
        if (var2 == 0) {
            this.field4374[0] = new class365(arg0, 0);
            this.field4369.put(arg0, this.field4374[0]);
        } else {
            this.field4374[var2] = new class365(arg0, var2);
            this.field4369.put(arg0, this.field4374[var2]);
            this.method6370(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4370 == 0 ? null : this.field4374[0].field4363;
    }

    public Object poll() {
        if (this.field4370 == 0) {
            return null;
        }
        this.field4373++;
        Object var1 = this.field4374[0].field4363;
        this.field4369.remove(var1);
        this.field4370--;
        if (this.field4370 == 0) {
            this.field4374[this.field4370] = null;
        } else {
            this.field4374[0] = this.field4374[this.field4370];
            this.field4374[0].field4364 = 0;
            this.field4374[this.field4370] = null;
            this.method6371(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class365 var2 = (class365) this.field4369.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4373++;
        this.field4370--;
        if (this.field4370 == var2.field4364) {
            this.field4374[this.field4370] = null;
            return true;
        }
        class365 var3 = this.field4374[this.field4370];
        this.field4374[this.field4370] = null;
        this.field4374[var2.field4364] = var3;
        this.field4374[var2.field4364].field4364 = var2.field4364;
        this.method6371(var2.field4364);
        if (this.field4374[var2.field4364] == var3) {
            this.method6370(var2.field4364);
        }
        return true;
    }

    @ObfuscatedName("nm.e(IB)V")
    public void method6370(int arg0) {
        class365 var2 = this.field4374[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class365 var4 = this.field4374[var3];
            if (this.field4372 == null) {
                if (((Comparable) var2.field4363).compareTo(var4.field4363) >= 0) {
                    break;
                }
            } else if (this.field4372.compare(var2.field4363, var4.field4363) >= 0) {
                break;
            }
            this.field4374[arg0] = var4;
            this.field4374[arg0].field4364 = arg0;
            arg0 = var3;
        }
        this.field4374[arg0] = var2;
        this.field4374[arg0].field4364 = arg0;
    }

    @ObfuscatedName("nm.v(IB)V")
    public void method6371(int arg0) {
        class365 var2 = this.field4374[arg0];
        int var3 = this.field4370 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class365 var5 = this.field4374[var4];
            int var6 = (arg0 << 1) + 2;
            class365 var7 = this.field4374[var6];
            int var8;
            if (this.field4372 == null) {
                if (var6 < this.field4370 && ((Comparable) var5.field4363).compareTo(var7.field4363) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4370 && this.field4372.compare(var5.field4363, var7.field4363) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4372 == null) {
                if (((Comparable) var2.field4363).compareTo(this.field4374[var8].field4363) <= 0) {
                    break;
                }
            } else if (this.field4372.compare(var2.field4363, this.field4374[var8].field4363) <= 0) {
                break;
            }
            this.field4374[arg0] = this.field4374[var8];
            this.field4374[arg0].field4364 = arg0;
            arg0 = var8;
        }
        this.field4374[arg0] = var2;
        this.field4374[arg0].field4364 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4369.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4372 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4372);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class366(this);
    }
}
