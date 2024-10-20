package deob;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;

@ObfuscatedName("y")
public class class19 {

    @ObfuscatedName("y.j")
    public int field256;

    @ObfuscatedName("y.h")
    public class147 field255;

    @ObfuscatedName("y.m")
    public DataInputStream field249;

    @ObfuscatedName("y.z")
    public byte[] field250 = new byte[4];

    @ObfuscatedName("y.x")
    public int field251;

    @ObfuscatedName("y.e")
    public byte[] field252;

    @ObfuscatedName("y.i")
    public int field253;

    @ObfuscatedName("y.c")
    public long field254;

    public class19(class137 arg0, URL arg1) {
        this.field255 = arg0.method2708(arg1);
        this.field256 = 0;
        this.field254 = class116.method1579() + 30000L;
    }

    @ObfuscatedName("y.j(I)[B")
    public byte[] method192() throws IOException {
        if (class116.method1579() > this.field254) {
            throw new IOException();
        }
        if (this.field256 == 0) {
            if (this.field255.field2196 == 2) {
                throw new IOException();
            }
            if (this.field255.field2196 == 1) {
                this.field249 = (DataInputStream) this.field255.field2195;
                this.field256 = 1;
            }
        }
        if (this.field256 == 1) {
            int var1 = this.field249.available();
            if (var1 > 0) {
                if (this.field251 + var1 > 4) {
                    var1 = 4 - this.field251;
                }
                this.field251 += this.field249.read(this.field250, this.field251, var1);
                if (this.field251 == 4) {
                    int var2 = (new class120(this.field250)).method2366();
                    this.field252 = new byte[var2];
                    this.field256 = 2;
                }
            }
        }
        if (this.field256 == 2) {
            int var3 = this.field249.available();
            if (var3 > 0) {
                if (this.field253 + var3 > this.field252.length) {
                    var3 = this.field252.length - this.field253;
                }
                this.field253 += this.field249.read(this.field252, this.field253, var3);
                if (this.field253 == this.field252.length) {
                    return this.field252;
                }
            }
        }
        return null;
    }
}
