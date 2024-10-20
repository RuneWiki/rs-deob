package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("d")
public class class19 {

    @ObfuscatedName("d.f")
    public int field275;

    @ObfuscatedName("d.s")
    public class146 field267;

    @ObfuscatedName("d.q")
    public DataInputStream field268;

    @ObfuscatedName("d.g")
    public byte[] field276 = new byte[4];

    @ObfuscatedName("d.m")
    public int field270;

    @ObfuscatedName("d.t")
    public byte[] field273;

    @ObfuscatedName("d.j")
    public int field272;

    @ObfuscatedName("d.n")
    public long field269;

    public class19(class136 arg0, URL arg1) {
        this.field267 = arg0.method2715(arg1);
        this.field275 = 0;
        this.field269 = class115.method645() + 30000L;
    }

    @ObfuscatedName("d.f(B)[B")
    public byte[] method183() throws IOException {
        if (class115.method645() > this.field269) {
            throw new IOException();
        }
        if (this.field275 == 0) {
            if (this.field267.field2206 == 2) {
                throw new IOException();
            }
            if (this.field267.field2206 == 1) {
                this.field268 = (DataInputStream) this.field267.field2205;
                this.field275 = 1;
            }
        }
        if (this.field275 == 1) {
            int var1 = this.field268.available();
            if (var1 > 0) {
                if (this.field270 + var1 > 4) {
                    var1 = 4 - this.field270;
                }
                this.field270 += this.field268.read(this.field276, this.field270, var1);
                if (this.field270 == 4) {
                    int var2 = (new class119(this.field276)).method2368();
                    this.field273 = new byte[var2];
                    this.field275 = 2;
                }
            }
        }
        if (this.field275 == 2) {
            int var3 = this.field268.available();
            if (var3 > 0) {
                if (this.field272 + var3 > this.field273.length) {
                    var3 = this.field273.length - this.field272;
                }
                this.field272 += this.field268.read(this.field273, this.field272, var3);
                if (this.field272 == this.field273.length) {
                    return this.field273;
                }
            }
        }
        return null;
    }
}
