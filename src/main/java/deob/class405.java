package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("ps")
public class class405 extends AbstractQueue {

    @ObfuscatedName("ps.at")
    public class403[] field4482;

    @ObfuscatedName("ps.ah")
    public Map field4480;

    @ObfuscatedName("ps.ar")
    public int field4486;

    @ObfuscatedName("ps.ao")
    public final Comparator field4481;

    @ObfuscatedName("ps.ab")
    public int field4484;

    public class405(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class405(int arg0, Comparator arg1) {
        this.field4484 = 0;
        this.field4482 = new class403[arg0];
        this.field4480 = new HashMap();
        this.field4481 = arg1;
    }

    @ObfuscatedName("ps.at(I)V")
    public void method6799() {
        int var1 = (this.field4482.length << 1) + 1;
        this.field4482 = (class403[]) ((class403[]) Arrays.copyOf(this.field4482, var1));
    }

    public int size() {
        return this.field4486;
    }

    public boolean offer(Object arg0) {
        if (this.field4480.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4484++;
        int var2 = this.field4486;
        if (var2 >= this.field4482.length) {
            this.method6799();
        }
        this.field4486++;
        if (var2 == 0) {
            this.field4482[0] = new class403(arg0, 0);
            this.field4480.put(arg0, this.field4482[0]);
        } else {
            this.field4482[var2] = new class403(arg0, var2);
            this.field4480.put(arg0, this.field4482[var2]);
            this.method6801(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4486 == 0 ? null : this.field4482[0].field4475;
    }

    public Object poll() {
        if (this.field4486 == 0) {
            return null;
        }
        this.field4484++;
        Object var1 = this.field4482[0].field4475;
        this.field4480.remove(var1);
        this.field4486--;
        if (this.field4486 == 0) {
            this.field4482[this.field4486] = null;
        } else {
            this.field4482[0] = this.field4482[this.field4486];
            this.field4482[0].field4473 = 0;
            this.field4482[this.field4486] = null;
            this.method6802(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class403 var2 = (class403) this.field4480.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4484++;
        this.field4486--;
        if (this.field4486 == var2.field4473) {
            this.field4482[this.field4486] = null;
            return true;
        }
        class403 var3 = this.field4482[this.field4486];
        this.field4482[this.field4486] = null;
        this.field4482[var2.field4473] = var3;
        this.field4482[var2.field4473].field4473 = var2.field4473;
        this.method6802(var2.field4473);
        if (this.field4482[var2.field4473] == var3) {
            this.method6801(var2.field4473);
        }
        return true;
    }

    @ObfuscatedName("ps.ah(II)V")
    public void method6801(int arg0) {
        class403 var2 = this.field4482[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class403 var4 = this.field4482[var3];
            if (this.field4481 == null) {
                if (((Comparable) var2.field4475).compareTo(var4.field4475) >= 0) {
                    break;
                }
            } else if (this.field4481.compare(var2.field4475, var4.field4475) >= 0) {
                break;
            }
            this.field4482[arg0] = var4;
            this.field4482[arg0].field4473 = arg0;
            arg0 = var3;
        }
        this.field4482[arg0] = var2;
        this.field4482[arg0].field4473 = arg0;
    }

    @ObfuscatedName("ps.ar(II)V")
    public void method6802(int arg0) {
        class403 var2 = this.field4482[arg0];
        int var3 = this.field4486 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class403 var5 = this.field4482[var4];
            int var6 = (arg0 << 1) + 2;
            class403 var7 = this.field4482[var6];
            int var8;
            if (this.field4481 == null) {
                if (var6 < this.field4486 && ((Comparable) var5.field4475).compareTo(var7.field4475) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4486 && this.field4481.compare(var5.field4475, var7.field4475) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4481 == null) {
                if (((Comparable) var2.field4475).compareTo(this.field4482[var8].field4475) <= 0) {
                    break;
                }
            } else if (this.field4481.compare(var2.field4475, this.field4482[var8].field4475) <= 0) {
                break;
            }
            this.field4482[arg0] = this.field4482[var8];
            this.field4482[arg0].field4473 = arg0;
            arg0 = var8;
        }
        this.field4482[arg0] = var2;
        this.field4482[arg0].field4473 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4480.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4481 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4481);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class404(this);
    }
}
