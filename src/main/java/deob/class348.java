package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("mo")
public class class348 extends AbstractQueue {

    @ObfuscatedName("mo.c")
    public class346[] field4167;

    @ObfuscatedName("mo.v")
    public Map field4168;

    @ObfuscatedName("mo.q")
    public int field4166;

    @ObfuscatedName("mo.f")
    public final Comparator field4169;

    @ObfuscatedName("mo.j")
    public int field4170;

    public class348(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class348(int arg0, Comparator arg1) {
        this.field4170 = 0;
        this.field4167 = new class346[arg0];
        this.field4168 = new HashMap();
        this.field4169 = arg1;
    }

    @ObfuscatedName("mo.c(B)V")
    public void method5775() {
        int var1 = (this.field4167.length << 1) + 1;
        this.field4167 = (class346[]) ((class346[]) Arrays.copyOf(this.field4167, var1));
    }

    public int size() {
        return this.field4166;
    }

    public boolean offer(Object arg0) {
        if (this.field4168.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4170++;
        int var2 = this.field4166;
        if (var2 >= this.field4167.length) {
            this.method5775();
        }
        this.field4166++;
        if (var2 == 0) {
            this.field4167[0] = new class346(arg0, 0);
            this.field4168.put(arg0, this.field4167[0]);
        } else {
            this.field4167[var2] = new class346(arg0, var2);
            this.field4168.put(arg0, this.field4167[var2]);
            this.method5776(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4166 == 0 ? null : this.field4167[0].field4160;
    }

    public Object poll() {
        if (this.field4166 == 0) {
            return null;
        }
        this.field4170++;
        Object var1 = this.field4167[0].field4160;
        this.field4168.remove(var1);
        this.field4166--;
        if (this.field4166 == 0) {
            this.field4167[this.field4166] = null;
        } else {
            this.field4167[0] = this.field4167[this.field4166];
            this.field4167[0].field4159 = 0;
            this.field4167[this.field4166] = null;
            this.method5788(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class346 var2 = (class346) this.field4168.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4170++;
        this.field4166--;
        if (this.field4166 == var2.field4159) {
            this.field4167[this.field4166] = null;
            return true;
        }
        class346 var3 = this.field4167[this.field4166];
        this.field4167[this.field4166] = null;
        this.field4167[var2.field4159] = var3;
        this.field4167[var2.field4159].field4159 = var2.field4159;
        this.method5788(var2.field4159);
        if (this.field4167[var2.field4159] == var3) {
            this.method5776(var2.field4159);
        }
        return true;
    }

    @ObfuscatedName("mo.v(II)V")
    public void method5776(int arg0) {
        class346 var2 = this.field4167[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class346 var4 = this.field4167[var3];
            if (this.field4169 == null) {
                if (((Comparable) var2.field4160).compareTo(var4.field4160) >= 0) {
                    break;
                }
            } else if (this.field4169.compare(var2.field4160, var4.field4160) >= 0) {
                break;
            }
            this.field4167[arg0] = var4;
            this.field4167[arg0].field4159 = arg0;
            arg0 = var3;
        }
        this.field4167[arg0] = var2;
        this.field4167[arg0].field4159 = arg0;
    }

    @ObfuscatedName("mo.q(II)V")
    public void method5788(int arg0) {
        class346 var2 = this.field4167[arg0];
        int var3 = this.field4166 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class346 var5 = this.field4167[var4];
            int var6 = (arg0 << 1) + 2;
            class346 var7 = this.field4167[var6];
            int var8;
            if (this.field4169 == null) {
                if (var6 < this.field4166 && ((Comparable) var5.field4160).compareTo(var7.field4160) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4166 && this.field4169.compare(var5.field4160, var7.field4160) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4169 == null) {
                if (((Comparable) var2.field4160).compareTo(this.field4167[var8].field4160) <= 0) {
                    break;
                }
            } else if (this.field4169.compare(var2.field4160, this.field4167[var8].field4160) <= 0) {
                break;
            }
            this.field4167[arg0] = this.field4167[var8];
            this.field4167[arg0].field4159 = arg0;
            arg0 = var8;
        }
        this.field4167[arg0] = var2;
        this.field4167[arg0].field4159 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4168.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4169 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4169);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class347(this);
    }
}
