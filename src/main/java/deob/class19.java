package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("a")
public class class19 {

    @ObfuscatedName("a.c")
    public int field251;

    @ObfuscatedName("a.h")
    public class146 field247;

    @ObfuscatedName("a.k")
    public DataInputStream field248;

    @ObfuscatedName("a.t")
    public byte[] field249 = new byte[4];

    @ObfuscatedName("a.g")
    public int field255;

    @ObfuscatedName("a.o")
    public byte[] field252;

    @ObfuscatedName("a.i")
    public int field256;

    @ObfuscatedName("a.w")
    public long field253;

    public class19(class136 arg0, URL arg1) {
        this.field247 = arg0.method2675(arg1);
        this.field251 = 0;
        this.field253 = class115.method2622() + 30000L;
    }

    @ObfuscatedName("a.c(I)[B")
    public byte[] method182() throws IOException {
        if (class115.method2622() > this.field253) {
            throw new IOException();
        }
        if (this.field251 == 0) {
            if (this.field247.field2184 == 2) {
                throw new IOException();
            }
            if (this.field247.field2184 == 1) {
                this.field248 = (DataInputStream) this.field247.field2188;
                this.field251 = 1;
            }
        }
        if (this.field251 == 1) {
            int var1 = this.field248.available();
            if (var1 > 0) {
                if (this.field255 + var1 > 4) {
                    var1 = 4 - this.field255;
                }
                this.field255 += this.field248.read(this.field249, this.field255, var1);
                if (this.field255 == 4) {
                    int var2 = (new class119(this.field249)).method2296();
                    this.field252 = new byte[var2];
                    this.field251 = 2;
                }
            }
        }
        if (this.field251 == 2) {
            int var3 = this.field248.available();
            if (var3 > 0) {
                if (this.field256 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field256;
                }
                this.field256 += this.field248.read(this.field252, this.field256, var3);
                if (this.field256 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
