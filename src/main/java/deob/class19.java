package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("r")
public class class19 {

    @ObfuscatedName("r.o")
    public int field250;

    @ObfuscatedName("r.e")
    public class146 field248;

    @ObfuscatedName("r.u")
    public DataInputStream field249;

    @ObfuscatedName("r.b")
    public byte[] field256 = new byte[4];

    @ObfuscatedName("r.p")
    public int field251;

    @ObfuscatedName("r.s")
    public byte[] field252;

    @ObfuscatedName("r.y")
    public int field258;

    @ObfuscatedName("r.t")
    public long field254;

    public class19(class136 arg0, URL arg1) {
        this.field248 = arg0.method2712(arg1);
        this.field250 = 0;
        this.field254 = class115.method102() + 30000L;
    }

    @ObfuscatedName("r.o(I)[B")
    public byte[] method198() throws IOException {
        if (class115.method102() > this.field254) {
            throw new IOException();
        }
        if (this.field250 == 0) {
            if (this.field248.field2208 == 2) {
                throw new IOException();
            }
            if (this.field248.field2208 == 1) {
                this.field249 = (DataInputStream) this.field248.field2215;
                this.field250 = 1;
            }
        }
        if (this.field250 == 1) {
            int var1 = this.field249.available();
            if (var1 > 0) {
                if (this.field251 + var1 > 4) {
                    var1 = 4 - this.field251;
                }
                this.field251 += this.field249.read(this.field256, this.field251, var1);
                if (this.field251 == 4) {
                    int var2 = (new class119(this.field256)).method2342();
                    this.field252 = new byte[var2];
                    this.field250 = 2;
                }
            }
        }
        if (this.field250 == 2) {
            int var3 = this.field249.available();
            if (var3 > 0) {
                if (this.field258 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field258;
                }
                this.field258 += this.field249.read(this.field252, this.field258, var3);
                if (this.field258 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
