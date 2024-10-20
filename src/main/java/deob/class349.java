package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mj")
public class class349 extends AbstractQueue {

    @ObfuscatedName("mj.s")
    public class347[] field4169;

    @ObfuscatedName("mj.h")
    public Map field4171;

    @ObfuscatedName("mj.w")
    public int field4170;

    @ObfuscatedName("mj.v")
    public final Comparator field4172;

    @ObfuscatedName("mj.c")
    public int field4173;

    public class349(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class349(int arg0, Comparator arg1) {
        this.field4173 = 0;
        this.field4169 = new class347[arg0];
        this.field4171 = new HashMap();
        this.field4172 = arg1;
    }

    @ObfuscatedName("mj.s(I)V")
    public void method5673() {
        int var1 = (this.field4169.length << 1) + 1;
        this.field4169 = (class347[]) ((class347[]) Arrays.copyOf(this.field4169, var1));
    }

    public int size() {
        return this.field4170;
    }

    public boolean offer(Object arg0) {
        if (this.field4171.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4173++;
        int var2 = this.field4170;
        if (var2 >= this.field4169.length) {
            this.method5673();
        }
        this.field4170++;
        if (var2 == 0) {
            this.field4169[0] = new class347(arg0, 0);
            this.field4171.put(arg0, this.field4169[0]);
        } else {
            this.field4169[var2] = new class347(arg0, var2);
            this.field4171.put(arg0, this.field4169[var2]);
            this.method5695(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4170 == 0 ? null : this.field4169[0].field4161;
    }

    public Object poll() {
        if (this.field4170 == 0) {
            return null;
        }
        this.field4173++;
        Object var1 = this.field4169[0].field4161;
        this.field4171.remove(var1);
        this.field4170--;
        if (this.field4170 == 0) {
            this.field4169[this.field4170] = null;
        } else {
            this.field4169[0] = this.field4169[this.field4170];
            this.field4169[0].field4162 = 0;
            this.field4169[this.field4170] = null;
            this.method5671(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class347 var2 = (class347) this.field4171.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4173++;
        this.field4170--;
        if (this.field4170 == var2.field4162) {
            this.field4169[this.field4170] = null;
            return true;
        }
        class347 var3 = this.field4169[this.field4170];
        this.field4169[this.field4170] = null;
        this.field4169[var2.field4162] = var3;
        this.field4169[var2.field4162].field4162 = var2.field4162;
        this.method5671(var2.field4162);
        if (this.field4169[var2.field4162] == var3) {
            this.method5695(var2.field4162);
        }
        return true;
    }

    @ObfuscatedName("mj.h(II)V")
    public void method5695(int arg0) {
        class347 var2 = this.field4169[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class347 var4 = this.field4169[var3];
            if (this.field4172 == null) {
                if (((Comparable) var2.field4161).compareTo(var4.field4161) >= 0) {
                    break;
                }
            } else if (this.field4172.compare(var2.field4161, var4.field4161) >= 0) {
                break;
            }
            this.field4169[arg0] = var4;
            this.field4169[arg0].field4162 = arg0;
            arg0 = var3;
        }
        this.field4169[arg0] = var2;
        this.field4169[arg0].field4162 = arg0;
    }

    @ObfuscatedName("mj.w(II)V")
    public void method5671(int arg0) {
        class347 var2 = this.field4169[arg0];
        int var3 = this.field4170 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class347 var5 = this.field4169[var4];
            int var6 = (arg0 << 1) + 2;
            class347 var7 = this.field4169[var6];
            int var8;
            if (this.field4172 == null) {
                if (var6 < this.field4170 && ((Comparable) var5.field4161).compareTo(var7.field4161) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4170 && this.field4172.compare(var5.field4161, var7.field4161) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4172 == null) {
                if (((Comparable) var2.field4161).compareTo(this.field4169[var8].field4161) <= 0) {
                    break;
                }
            } else if (this.field4172.compare(var2.field4161, this.field4169[var8].field4161) <= 0) {
                break;
            }
            this.field4169[arg0] = this.field4169[var8];
            this.field4169[arg0].field4162 = arg0;
            arg0 = var8;
        }
        this.field4169[arg0] = var2;
        this.field4169[arg0].field4162 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4171.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4172 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4172);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class348(this);
    }
}
