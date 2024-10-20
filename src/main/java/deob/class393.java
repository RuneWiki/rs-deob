package deob;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ObfuscatedName("pa")
public class class393 extends AbstractQueue {

    @ObfuscatedName("pa.au")
    public class391[] field4449;

    @ObfuscatedName("pa.ae")
    public Map field4448;

    @ObfuscatedName("pa.ao")
    public int field4451;

    @ObfuscatedName("pa.at")
    public final Comparator field4450;

    @ObfuscatedName("pa.ac")
    public int field4447;

    public class393(int arg0) {
        this(arg0, (Comparator) null);
    }

    public class393(int arg0, Comparator arg1) {
        this.field4447 = 0;
        this.field4449 = new class391[arg0];
        this.field4448 = new HashMap();
        this.field4450 = arg1;
    }

    @ObfuscatedName("pa.au(B)V")
    public void method6643() {
        int var1 = (this.field4449.length << 1) + 1;
        this.field4449 = (class391[]) ((class391[]) Arrays.copyOf(this.field4449, var1));
    }

    public int size() {
        return this.field4451;
    }

    public boolean offer(Object arg0) {
        if (this.field4448.containsKey(arg0)) {
            throw new IllegalArgumentException("");
        }
        this.field4447++;
        int var2 = this.field4451;
        if (var2 >= this.field4449.length) {
            this.method6643();
        }
        this.field4451++;
        if (var2 == 0) {
            this.field4449[0] = new class391(arg0, 0);
            this.field4448.put(arg0, this.field4449[0]);
        } else {
            this.field4449[var2] = new class391(arg0, var2);
            this.field4448.put(arg0, this.field4449[var2]);
            this.method6652(var2);
        }
        return true;
    }

    public Object peek() {
        return this.field4451 == 0 ? null : this.field4449[0].field4441;
    }

    public Object poll() {
        if (this.field4451 == 0) {
            return null;
        }
        this.field4447++;
        Object var1 = this.field4449[0].field4441;
        this.field4448.remove(var1);
        this.field4451--;
        if (this.field4451 == 0) {
            this.field4449[this.field4451] = null;
        } else {
            this.field4449[0] = this.field4449[this.field4451];
            this.field4449[0].field4440 = 0;
            this.field4449[this.field4451] = null;
            this.method6671(0);
        }
        return var1;
    }

    public boolean remove(Object arg0) {
        class391 var2 = (class391) this.field4448.remove(arg0);
        if (var2 == null) {
            return false;
        }
        this.field4447++;
        this.field4451--;
        if (this.field4451 == var2.field4440) {
            this.field4449[this.field4451] = null;
            return true;
        }
        class391 var3 = this.field4449[this.field4451];
        this.field4449[this.field4451] = null;
        this.field4449[var2.field4440] = var3;
        this.field4449[var2.field4440].field4440 = var2.field4440;
        this.method6671(var2.field4440);
        if (this.field4449[var2.field4440] == var3) {
            this.method6652(var2.field4440);
        }
        return true;
    }

    @ObfuscatedName("pa.ae(IB)V")
    public void method6652(int arg0) {
        class391 var2 = this.field4449[arg0];
        while (arg0 > 0) {
            int var3 = arg0 - 1 >>> 1;
            class391 var4 = this.field4449[var3];
            if (this.field4450 == null) {
                if (((Comparable) var2.field4441).compareTo(var4.field4441) >= 0) {
                    break;
                }
            } else if (this.field4450.compare(var2.field4441, var4.field4441) >= 0) {
                break;
            }
            this.field4449[arg0] = var4;
            this.field4449[arg0].field4440 = arg0;
            arg0 = var3;
        }
        this.field4449[arg0] = var2;
        this.field4449[arg0].field4440 = arg0;
    }

    @ObfuscatedName("pa.ao(II)V")
    public void method6671(int arg0) {
        class391 var2 = this.field4449[arg0];
        int var3 = this.field4451 >>> 1;
        while (arg0 < var3) {
            int var4 = (arg0 << 1) + 1;
            class391 var5 = this.field4449[var4];
            int var6 = (arg0 << 1) + 2;
            class391 var7 = this.field4449[var6];
            int var8;
            if (this.field4450 == null) {
                if (var6 < this.field4451 && ((Comparable) var5.field4441).compareTo(var7.field4441) > 0) {
                    var8 = var6;
                } else {
                    var8 = var4;
                }
            } else if (var6 < this.field4451 && this.field4450.compare(var5.field4441, var7.field4441) > 0) {
                var8 = var6;
            } else {
                var8 = var4;
            }
            if (this.field4450 == null) {
                if (((Comparable) var2.field4441).compareTo(this.field4449[var8].field4441) <= 0) {
                    break;
                }
            } else if (this.field4450.compare(var2.field4441, this.field4449[var8].field4441) <= 0) {
                break;
            }
            this.field4449[arg0] = this.field4449[var8];
            this.field4449[arg0].field4440 = arg0;
            arg0 = var8;
        }
        this.field4449[arg0] = var2;
        this.field4449[arg0].field4440 = arg0;
    }

    public boolean contains(Object arg0) {
        return this.field4448.containsKey(arg0);
    }

    public Object[] toArray() {
        Object[] var1 = super.toArray();
        if (this.field4450 == null) {
            Arrays.sort(var1);
        } else {
            Arrays.sort(var1, this.field4450);
        }
        return var1;
    }

    public Iterator iterator() {
        return new class392(this);
    }
}
