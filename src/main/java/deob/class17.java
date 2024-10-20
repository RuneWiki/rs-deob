package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("u")
public class class17 {

    @ObfuscatedName("u.k")
    public int field241;

    @ObfuscatedName("u.r")
    public class133 field248;

    @ObfuscatedName("u.y")
    public DataInputStream field237;

    @ObfuscatedName("u.w")
    public byte[] field238 = new byte[4];

    @ObfuscatedName("u.m")
    public int field239;

    @ObfuscatedName("u.j")
    public byte[] field240;

    @ObfuscatedName("u.g")
    public int field243;

    @ObfuscatedName("u.p")
    public long field242;

    public class17(class123 arg0, URL arg1) {
        this.field248 = arg0.method2464(arg1);
        this.field241 = 0;
        this.field242 = class103.method470() + 30000L;
    }

    @ObfuscatedName("u.k(I)[B")
    public byte[] method149() throws IOException {
        if (class103.method470() > this.field242) {
            throw new IOException();
        }
        if (this.field241 == 0) {
            if (this.field248.field2066 == 2) {
                throw new IOException();
            }
            if (this.field248.field2066 == 1) {
                this.field237 = (DataInputStream) this.field248.field2070;
                this.field241 = 1;
            }
        }
        if (this.field241 == 1) {
            int var1 = this.field237.available();
            if (var1 > 0) {
                if (this.field239 + var1 > 4) {
                    var1 = 4 - this.field239;
                }
                this.field239 += this.field237.read(this.field238, this.field239, var1);
                if (this.field239 == 4) {
                    int var2 = (new class107(this.field238)).method2116();
                    this.field240 = new byte[var2];
                    this.field241 = 2;
                }
            }
        }
        if (this.field241 == 2) {
            int var3 = this.field237.available();
            if (var3 > 0) {
                if (this.field243 + var3 > this.field240.length) {
                    var3 = this.field240.length - this.field243;
                }
                this.field243 += this.field237.read(this.field240, this.field243, var3);
                if (this.field243 == this.field240.length) {
                    return this.field240;
                }
            }
        }
        return null;
    }
}
