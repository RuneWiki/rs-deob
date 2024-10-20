package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("n")
public class class17 {

    @ObfuscatedName("n.k")
    public int field240;

    @ObfuscatedName("n.b")
    public class133 field249;

    @ObfuscatedName("n.e")
    public DataInputStream field237;

    @ObfuscatedName("n.i")
    public byte[] field238 = new byte[4];

    @ObfuscatedName("n.t")
    public int field244;

    @ObfuscatedName("n.z")
    public byte[] field239;

    @ObfuscatedName("n.g")
    public int field241;

    @ObfuscatedName("n.c")
    public long field242;

    public class17(class123 arg0, URL arg1) {
        this.field249 = arg0.method2465(arg1);
        this.field240 = 0;
        this.field242 = class103.method2455() + 30000L;
    }

    @ObfuscatedName("n.k(I)[B")
    public byte[] method174() throws IOException {
        if (class103.method2455() > this.field242) {
            throw new IOException();
        }
        if (this.field240 == 0) {
            if (this.field249.field2069 == 2) {
                throw new IOException();
            }
            if (this.field249.field2069 == 1) {
                this.field237 = (DataInputStream) this.field249.field2070;
                this.field240 = 1;
            }
        }
        if (this.field240 == 1) {
            int var1 = this.field237.available();
            if (var1 > 0) {
                if (this.field244 + var1 > 4) {
                    var1 = 4 - this.field244;
                }
                this.field244 += this.field237.read(this.field238, this.field244, var1);
                if (this.field244 == 4) {
                    int var2 = (new class107(this.field238)).method2120();
                    this.field239 = new byte[var2];
                    this.field240 = 2;
                }
            }
        }
        if (this.field240 == 2) {
            int var3 = this.field237.available();
            if (var3 > 0) {
                if (this.field241 + var3 > this.field239.length) {
                    var3 = this.field239.length - this.field241;
                }
                this.field241 += this.field237.read(this.field239, this.field241, var3);
                if (this.field241 == this.field239.length) {
                    return this.field239;
                }
            }
        }
        return null;
    }
}
