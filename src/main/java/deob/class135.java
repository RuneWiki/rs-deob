package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ej")
public final class class135 implements Runnable {

    @ObfuscatedName("ej.o")
    public Socket field2081;

    @ObfuscatedName("ej.l")
    public InputStream field2073;

    @ObfuscatedName("ej.g")
    public OutputStream field2072;

    @ObfuscatedName("ej.u")
    public boolean field2074 = false;

    @ObfuscatedName("ej.q")
    public class128 field2078;

    @ObfuscatedName("ej.r")
    public class138 field2076;

    @ObfuscatedName("ej.v")
    public byte[] field2075;

    @ObfuscatedName("ej.y")
    public int field2077 = 0;

    @ObfuscatedName("ej.k")
    public int field2079 = 0;

    @ObfuscatedName("ej.c")
    public boolean field2080 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2078 = arg1;
        this.field2081 = arg0;
        this.field2081.setSoTimeout(30000);
        this.field2081.setTcpNoDelay(true);
        this.field2073 = this.field2081.getInputStream();
        this.field2072 = this.field2081.getOutputStream();
    }

    @ObfuscatedName("ej.g(I)V")
    public void method2708() {
        if (this.field2074) {
            return;
        }
        synchronized (this) {
            this.field2074 = true;
            this.notifyAll();
        }
        if (this.field2076 != null) {
            while (this.field2076.field2105 == 0) {
                Statics.method832(1L);
            }
            if (this.field2076.field2105 == 1) {
                try {
                    ((Thread) this.field2076.field2101).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2076 = null;
    }

    public void finalize() {
        this.method2708();
    }

    @ObfuscatedName("ej.u(B)I")
    public int method2705() throws IOException {
        return this.field2074 ? 0 : this.field2073.read();
    }

    @ObfuscatedName("ej.q(I)I")
    public int method2704() throws IOException {
        return this.field2074 ? 0 : this.field2073.available();
    }

    @ObfuscatedName("ej.r([BIIB)V")
    public void method2707(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2074) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2073.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ej.v([BIII)V")
    public void method2717(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2074) {
            return;
        }
        if (this.field2080) {
            this.field2080 = false;
            throw new IOException();
        }
        if (this.field2075 == null) {
            this.field2075 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2075[this.field2079] = arg0[arg1 + var5];
                this.field2079 = (this.field2079 + 1) % 5000;
                if ((this.field2077 + 4900) % 5000 == this.field2079) {
                    throw new IOException();
                }
            }
            if (this.field2076 == null) {
                this.field2076 = this.field2078.method2607(this, 3);
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
                        if (this.field2079 == this.field2077) {
                            if (this.field2074) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2077;
                        if (this.field2079 >= this.field2077) {
                            var4 = this.field2079 - this.field2077;
                        } else {
                            var4 = 5000 - this.field2077;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2072.write(this.field2075, var3, var4);
                    } catch (IOException var12) {
                        this.field2080 = true;
                    }
                    this.field2077 = (this.field2077 + var4) % 5000;
                    try {
                        if (this.field2079 == this.field2077) {
                            this.field2072.flush();
                        }
                    } catch (IOException var11) {
                        this.field2080 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2073 != null) {
                        this.field2073.close();
                    }
                    if (this.field2072 != null) {
                        this.field2072.close();
                    }
                    if (this.field2081 != null) {
                        this.field2081.close();
                    }
                } catch (IOException var10) {
                }
                this.field2075 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method530((String) null, var15);
        }
    }
}
