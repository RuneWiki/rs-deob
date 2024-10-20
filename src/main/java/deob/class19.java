package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("c")
public class class19 {

    @ObfuscatedName("c.t")
    public int field263;

    @ObfuscatedName("c.i")
    public byte[] field254 = new byte[4];

    @ObfuscatedName("c.g")
    public class147 field252;

    @ObfuscatedName("c.h")
    public DataInputStream field253;

    @ObfuscatedName("c.z")
    public int field255;

    @ObfuscatedName("c.r")
    public byte[] field256;

    @ObfuscatedName("c.f")
    public int field257;

    @ObfuscatedName("c.s")
    public long field258;

    public class19(class137 arg0, URL arg1) {
        this.field252 = arg0.method2691(arg1);
        this.field263 = 0;
        this.field258 = class116.method2586() + 30000L;
    }

    @ObfuscatedName("c.t(B)[B")
    public byte[] method163() throws IOException {
        if (class116.method2586() > this.field258) {
            throw new IOException();
        }
        if (this.field263 == 0) {
            if (this.field252.field2250 == 2) {
                throw new IOException();
            }
            if (this.field252.field2250 == 1) {
                this.field253 = (DataInputStream) this.field252.field2247;
                this.field263 = 1;
            }
        }
        if (this.field263 == 1) {
            int var1 = this.field253.available();
            if (var1 > 0) {
                if (this.field255 + var1 > 4) {
                    var1 = 4 - this.field255;
                }
                this.field255 += this.field253.read(this.field254, this.field255, var1);
                if (this.field255 == 4) {
                    int var2 = (new class120(this.field254)).method2345();
                    this.field256 = new byte[var2];
                    this.field263 = 2;
                }
            }
        }
        if (this.field263 == 2) {
            int var3 = this.field253.available();
            if (var3 > 0) {
                if (this.field257 + var3 > this.field256.length) {
                    var3 = this.field256.length - this.field257;
                }
                this.field257 += this.field253.read(this.field256, this.field257, var3);
                if (this.field257 == this.field256.length) {
                    return this.field256;
                }
            }
        }
        return null;
    }
}
