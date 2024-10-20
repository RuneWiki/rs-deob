package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fi")
public final class class169 extends class165 implements Runnable {

    @ObfuscatedName("fi.a")
    public InputStream field2077;

    @ObfuscatedName("fi.s")
    public OutputStream field2070;

    @ObfuscatedName("fi.g")
    public Socket field2071;

    @ObfuscatedName("fi.x")
    public boolean field2072 = false;

    @ObfuscatedName("fi.h")
    public class162 field2075;

    @ObfuscatedName("fi.f")
    public class161 field2074;

    @ObfuscatedName("fi.p")
    public byte[] field2073;

    @ObfuscatedName("fi.m")
    public int field2076 = 0;

    @ObfuscatedName("fi.q")
    public int field2069 = 0;

    @ObfuscatedName("fi.b")
    public boolean field2078 = false;

    @ObfuscatedName("fi.n")
    public final int field2079;

    @ObfuscatedName("fi.e")
    public final int field2080;

    public class169(Socket arg0, class162 arg1, int arg2) throws IOException {
        this.field2075 = arg1;
        this.field2071 = arg0;
        this.field2079 = arg2;
        this.field2080 = arg2 - 100;
        this.field2071.setSoTimeout(30000);
        this.field2071.setTcpNoDelay(true);
        this.field2071.setReceiveBufferSize(65536);
        this.field2071.setSendBufferSize(65536);
        this.field2077 = this.field2071.getInputStream();
        this.field2070 = this.field2071.getOutputStream();
    }

    @ObfuscatedName("fi.f(B)V")
    public void method3251() {
        if (this.field2072) {
            return;
        }
        synchronized (this) {
            this.field2072 = true;
            this.notifyAll();
        }
        if (this.field2074 != null) {
            while (this.field2074.field2030 == 0) {
                class199.method3774(1L);
            }
            if (this.field2074.field2030 == 1) {
                try {
                    ((Thread) this.field2074.field2033).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2074 = null;
    }

    public void finalize() {
        this.method3251();
    }

    @ObfuscatedName("fi.g(I)I")
    public int method3253() throws IOException {
        return this.field2072 ? 0 : this.field2077.read();
    }

    @ObfuscatedName("fi.s(B)I")
    public int method3252() throws IOException {
        return this.field2072 ? 0 : this.field2077.available();
    }

    @ObfuscatedName("fi.a(II)Z")
    public boolean method3250(int arg0) throws IOException {
        if (this.field2072) {
            return false;
        } else {
            return this.field2077.available() >= arg0;
        }
    }

    @ObfuscatedName("fi.x([BIIB)I")
    public int method3258(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2072) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2077.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fi.k([BIII)V")
    public void method3279(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2072) {
            return;
        }
        if (this.field2078) {
            this.field2078 = false;
            throw new IOException();
        }
        if (this.field2073 == null) {
            this.field2073 = new byte[this.field2079];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2073[this.field2069] = arg0[arg1 + var5];
                this.field2069 = (this.field2069 + 1) % this.field2079;
                if ((this.field2080 + this.field2076) % this.field2079 == this.field2069) {
                    throw new IOException();
                }
            }
            if (this.field2074 == null) {
                this.field2074 = this.field2075.method3221(this, 3);
            }
            this.notifyAll();
        }
    }

    public void run() {
        try {
            while (true) {
                label84: {
                    int var3;
                    int var4;
                    synchronized (this) {
                        if (this.field2076 == this.field2069) {
                            if (this.field2072) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2076;
                        if (this.field2069 >= this.field2076) {
                            var4 = this.field2069 - this.field2076;
                        } else {
                            var4 = this.field2079 - this.field2076;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2070.write(this.field2073, var3, var4);
                    } catch (IOException var12) {
                        this.field2078 = true;
                    }
                    this.field2076 = (this.field2076 + var4) % this.field2079;
                    try {
                        if (this.field2076 == this.field2069) {
                            this.field2070.flush();
                        }
                    } catch (IOException var11) {
                        this.field2078 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2077 != null) {
                        this.field2077.close();
                    }
                    if (this.field2070 != null) {
                        this.field2070.close();
                    }
                    if (this.field2071 != null) {
                        this.field2071.close();
                    }
                } catch (IOException var10) {
                }
                this.field2073 = null;
                break;
            }
        } catch (Exception var15) {
            class160.method2786((String) null, var15);
        }
    }

    @ObfuscatedName("fi.h([BIII)V")
    public void method3255(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3279(arg0, arg1, arg2);
    }
}
