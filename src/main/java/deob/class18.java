package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("t")
public class class18 {

    @ObfuscatedName("t.n")
    public int field250;

    @ObfuscatedName("t.o")
    public class138 field253;

    @ObfuscatedName("t.a")
    public DataInputStream field263;

    @ObfuscatedName("t.w")
    public byte[] field252 = new byte[4];

    @ObfuscatedName("t.m")
    public int field257;

    @ObfuscatedName("t.h")
    public byte[] field254;

    @ObfuscatedName("t.i")
    public int field255;

    @ObfuscatedName("t.r")
    public long field256;

    public class18(class128 arg0, URL arg1) {
        this.field253 = arg0.method2612(arg1);
        this.field250 = 0;
        this.field256 = class107.method1430() + 30000L;
    }

    @ObfuscatedName("t.n(B)[B")
    public byte[] method160() throws IOException {
        if (class107.method1430() > this.field256) {
            throw new IOException();
        }
        if (this.field250 == 0) {
            if (this.field253.field2115 == 2) {
                throw new IOException();
            }
            if (this.field253.field2115 == 1) {
                this.field263 = (DataInputStream) this.field253.field2118;
                this.field250 = 1;
            }
        }
        if (this.field250 == 1) {
            int var1 = this.field263.available();
            if (var1 > 0) {
                if (this.field257 + var1 > 4) {
                    var1 = 4 - this.field257;
                }
                this.field257 += this.field263.read(this.field252, this.field257, var1);
                if (this.field257 == 4) {
                    int var2 = (new class111(this.field252)).method2239();
                    this.field254 = new byte[var2];
                    this.field250 = 2;
                }
            }
        }
        if (this.field250 == 2) {
            int var3 = this.field263.available();
            if (var3 > 0) {
                if (this.field255 + var3 > this.field254.length) {
                    var3 = this.field254.length - this.field255;
                }
                this.field255 += this.field263.read(this.field254, this.field255, var3);
                if (this.field255 == this.field254.length) {
                    return this.field254;
                }
            }
        }
        return null;
    }
}
