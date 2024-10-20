package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("o")
public class class19 {

    @ObfuscatedName("o.s")
    public int field244;

    @ObfuscatedName("o.z")
    public class150 field238;

    @ObfuscatedName("o.t")
    public DataInputStream field239;

    @ObfuscatedName("o.y")
    public byte[] field240 = new byte[4];

    @ObfuscatedName("o.p")
    public int field241;

    @ObfuscatedName("o.g")
    public byte[] field242;

    @ObfuscatedName("o.m")
    public int field249;

    @ObfuscatedName("o.f")
    public long field250;

    public class19(class140 arg0, URL arg1) {
        this.field238 = arg0.method2757(arg1);
        this.field244 = 0;
        this.field250 = class119.method2280() + 30000L;
    }

    @ObfuscatedName("o.s(B)[B")
    public byte[] method190() throws IOException {
        if (class119.method2280() > this.field250) {
            throw new IOException();
        }
        if (this.field244 == 0) {
            if (this.field238.field2258 == 2) {
                throw new IOException();
            }
            if (this.field238.field2258 == 1) {
                this.field239 = (DataInputStream) this.field238.field2262;
                this.field244 = 1;
            }
        }
        if (this.field244 == 1) {
            int var1 = this.field239.available();
            if (var1 > 0) {
                if (this.field241 + var1 > 4) {
                    var1 = 4 - this.field241;
                }
                this.field241 += this.field239.read(this.field240, this.field241, var1);
                if (this.field241 == 4) {
                    int var2 = (new class123(this.field240)).method2408();
                    this.field242 = new byte[var2];
                    this.field244 = 2;
                }
            }
        }
        if (this.field244 == 2) {
            int var3 = this.field239.available();
            if (var3 > 0) {
                if (this.field249 + var3 > this.field242.length) {
                    var3 = this.field242.length - this.field249;
                }
                this.field249 += this.field239.read(this.field242, this.field249, var3);
                if (this.field249 == this.field242.length) {
                    return this.field242;
                }
            }
        }
        return null;
    }
}
