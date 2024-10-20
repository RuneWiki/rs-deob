package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pu")
public class class391 extends AbstractQueue {

    @ObfuscatedName("pu.at")
    public class389[] field4417;

    @ObfuscatedName("pu.an")
    public Map field4414;

    @ObfuscatedName("pu.av")
    public int field4413;

    @ObfuscatedName("pu.as")
    public final Comparator field4416;

    @ObfuscatedName("pu.ax")
    public int field4415;

    public class391(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class391(int arg0, Comparator arg1) {
        this.field4415 = 0;
        this.field4417 = new class389[arg0];
        this.field4414 = new HashMap();
        this.field4416 = arg1;
    }

    @ObfuscatedName("pu.at(B)V")
    public void method6582() {
        int var1 = (this.field4417.length << 1) + 1;
        this.field4417 = (class389[]) ((class389[]) Arrays.copyOf(this.field4417, var1));
    }

    public int size() {
        return this.field4413;
    }

    public boolean offer(Object arg0) {
        if (this.field4414.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4415++;
        int var2 = this.field4413;
        if (var2 >= this.field4417.length) {
            this.method6582();
        }
        this.field4413++;
        if (var2 == 0) {
            this.field4417[0] = new class389(arg0, 0);
            this.field4414.put(arg0, this.field4417[0]);
        } else {
            this.field4417[var2] = new class389(arg0, var2);
            this.field4414.put(arg0, this.field4417[var2]);
            this.method6583(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4413 == 0 ? null : this.field4417[0].field4407;
    }

    public Object poll() {
        if (this.field4413 == 0) {
            return null;
        }
        this.field4415++;
        Object var1 = this.field4417[0].field4407;
        this.field4414.remove(var1);
        this.field4413--;
        if (this.field4413 == 0) {
            this.field4417[this.field4413] = null;
        } else {
            this.field4417[0] = this.field4417[this.field4413];
            this.field4417[0].field4408 = 0;
            this.field4417[this.field4413] = null;
            this.method6581(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class389 var2 = (class389) this.field4414.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4415++;
        this.field4413--;
        if (this.field4413 == var2.field4408) {
            this.field4417[this.field4413] = null;
            return true;
        }
        class389 var3 = this.field4417[this.field4413];
        this.field4417[this.field4413] = null;
        this.field4417[var2.field4408] = var3;
        this.field4417[var2.field4408].field4408 = var2.field4408;
        this.method6581(var2.field4408);
        if (this.field4417[var2.field4408] == var3) {
            this.method6583(var2.field4408);
        }
        return true;
    }

    @ObfuscatedName("pu.an(II)V")
    public void method6583(int arg0) {
        class389 var2 = this.field4417[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class389 var4 = this.field4417[var3];
            if (this.field4416 == null) {
                if (((Comparable) var2.field4407).compareTo(var4.field4407) >= 0) {
                    break;
                }
            } else if (this.field4416.compare(var2.field4407, var4.field4407) >= 0) {
                break;
            }
            this.field4417[arg0] = var4;
            this.field4417[arg0].field4408 = arg0;
            arg0 = var3;
        }
        this.field4417[arg0] = var2;
        this.field4417[arg0].field4408 = arg0;
    }

    @ObfuscatedName("pu.av(IB)V")
    public void method6581(int arg0) {
        class389 var2 = this.field4417[arg0];
        int var3 = this.field4413 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class389 var5 = this.field4417[var4];
            int var6 = (arg0 << 1) + 2;
            class389 var7 = this.field4417[var6];
            int var8;
            if (this.field4416 == null) {
                if (var6 < this.field4413 && ((Comparable) var5.field4407).compareTo(var7.field4407) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4413 && this.field4416.compare(var5.field4407, var7.field4407) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4416 == null) {
                if (((Comparable) var2.field4407).compareTo(this.field4417[var8].field4407) <= 0) {
                    break;
                }
            } else if (this.field4416.compare(var2.field4407, this.field4417[var8].field4407) <= 0) {
                break;
            }
            this.field4417[arg0] = this.field4417[var8];
            this.field4417[arg0].field4408 = arg0;
            arg0 = var8;
        }
        this.field4417[arg0] = var2;
        this.field4417[arg0].field4408 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4414.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4416 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4416);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class390(this);
    }
}
