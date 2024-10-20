package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("y")
public class class19 {

    @ObfuscatedName("y.j")
    public int field246;

    @ObfuscatedName("y.m")
    public class146 field247;

    @ObfuscatedName("y.f")
    public DataInputStream field248;

    @ObfuscatedName("y.l")
    public byte[] field249 = new byte[4];

    @ObfuscatedName("y.u")
    public int field250;

    @ObfuscatedName("y.a")
    public byte[] field251;

    @ObfuscatedName("y.h")
    public int field257;

    @ObfuscatedName("y.i")
    public long field252;

    public class19(class136 arg0, URL arg1) {
        this.field247 = arg0.method2745(arg1);
        this.field246 = 0;
        this.field252 = class115.method2038() + 30000L;
    }

    @ObfuscatedName("y.j(B)[B")
    public byte[] method209() throws IOException {
        if (class115.method2038() > this.field252) {
            throw new IOException();
        }
        if (this.field246 == 0) {
            if (this.field247.field2199 == 2) {
                throw new IOException();
            }
            if (this.field247.field2199 == 1) {
                this.field248 = (DataInputStream) this.field247.field2205;
                this.field246 = 1;
            }
        }
        if (this.field246 == 1) {
            int var1 = this.field248.available();
            if (var1 > 0) {
                if (this.field250 + var1 > 4) {
                    var1 = 4 - this.field250;
                }
                this.field250 += this.field248.read(this.field249, this.field250, var1);
                if (this.field250 == 4) {
                    int var2 = (new class119(this.field249)).method2377();
                    this.field251 = new byte[var2];
                    this.field246 = 2;
                }
            }
        }
        if (this.field246 == 2) {
            int var3 = this.field248.available();
            if (var3 > 0) {
                if (this.field257 + var3 > this.field251.length) {
                    var3 = this.field251.length - this.field257;
                }
                this.field257 += this.field248.read(this.field251, this.field257, var3);
                if (this.field257 == this.field251.length) {
                    return this.field251;
                }
            }
        }
        return null;
    }
}
