package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("p")
public class class24 {

    @ObfuscatedName("p.i")
    public byte[] field386 = new byte[4];

    @ObfuscatedName("p.v")
    public int field384;

    @ObfuscatedName("p.m")
    public class79 field390;

    @ObfuscatedName("p.j")
    public DataInputStream field385;

    @ObfuscatedName("p.o")
    public int field383;

    @ObfuscatedName("p.l")
    public byte[] field393;

    @ObfuscatedName("p.g")
    public int field389;

    @ObfuscatedName("p.w")
    public long field387;

    public class24(class74 arg0, URL arg1) {
        this.field390 = arg0.method1505(arg1);
        this.field384 = 0;
        this.field387 = class121.method142() + 30000L;
    }

    @ObfuscatedName("p.i(I)[B")
    public byte[] method229() throws IOException {
        if (class121.method142() > this.field387) {
            throw new IOException();
        }
        if (this.field384 == 0) {
            if (this.field390.field1415 == 2) {
                throw new IOException();
            }
            if (this.field390.field1415 == 1) {
                this.field385 = (DataInputStream) this.field390.field1410;
                this.field384 = 1;
            }
        }
        if (this.field384 == 1) {
            int var1 = this.field385.available();
            if (var1 > 0) {
                if (this.field383 + var1 > 4) {
                    var1 = 4 - this.field383;
                }
                this.field383 += this.field385.read(this.field386, this.field383, var1);
                if (this.field383 == 4) {
                    int var2 = (new class127(this.field386)).method2668();
                    this.field393 = new byte[var2];
                    this.field384 = 2;
                }
            }
        }
        if (this.field384 == 2) {
            int var3 = this.field385.available();
            if (var3 > 0) {
                if (this.field389 + var3 > this.field393.length) {
                    var3 = this.field393.length - this.field389;
                }
                this.field389 += this.field385.read(this.field393, this.field389, var3);
                if (this.field389 == this.field393.length) {
                    return this.field393;
                }
            }
        }
        return null;
    }
}
