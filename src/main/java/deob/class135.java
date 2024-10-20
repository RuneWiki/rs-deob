package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ek")
public final class class135 implements Runnable {

    @ObfuscatedName("ek.n")
    public InputStream field2081;

    @ObfuscatedName("ek.o")
    public Socket field2076;

    @ObfuscatedName("ek.a")
    public OutputStream field2077;

    @ObfuscatedName("ek.w")
    public boolean field2079 = false;

    @ObfuscatedName("ek.m")
    public class128 field2087;

    @ObfuscatedName("ek.h")
    public class138 field2080;

    @ObfuscatedName("ek.i")
    public byte[] field2082;

    @ObfuscatedName("ek.r")
    public int field2083 = 0;

    @ObfuscatedName("ek.l")
    public int field2084 = 0;

    @ObfuscatedName("ek.f")
    public boolean field2085 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2087 = arg1;
        this.field2076 = arg0;
        this.field2076.setSoTimeout(30000);
        this.field2076.setTcpNoDelay(true);
        this.field2081 = this.field2076.getInputStream();
        this.field2077 = this.field2076.getOutputStream();
    }

    @ObfuscatedName("ek.w(I)V")
    public void method2724() {
        if (this.field2079) {
            return;
        }
        synchronized (this) {
            this.field2079 = true;
            this.notifyAll();
        }
        if (this.field2080 != null) {
            while (this.field2080.field2115 == 0) {
                class119.method2156(1L);
            }
            if (this.field2080.field2115 == 1) {
                try {
                    ((Thread) this.field2080.field2118).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2080 = null;
    }

    public void finalize() {
        this.method2724();
    }

    @ObfuscatedName("ek.m(I)I")
    public int method2720() throws IOException {
        return this.field2079 ? 0 : this.field2081.read();
    }

    @ObfuscatedName("ek.h(B)I")
    public int method2712() throws IOException {
        return this.field2079 ? 0 : this.field2081.available();
    }

    @ObfuscatedName("ek.i([BIII)V")
    public void method2713(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2079) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2081.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ek.r([BIII)V")
    public void method2714(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2079) {
            return;
        }
        if (this.field2085) {
            this.field2085 = false;
            throw new IOException();
        }
        if (this.field2082 == null) {
            this.field2082 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2082[this.field2084] = arg0[arg1 + var5];
                this.field2084 = (this.field2084 + 1) % 5000;
                if ((this.field2083 + 4900) % 5000 == this.field2084) {
                    throw new IOException();
                }
            }
            if (this.field2080 == null) {
                this.field2080 = this.field2087.method2610(this, 3);
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
                        if (this.field2084 == this.field2083) {
                            if (this.field2079) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2083;
                        if (this.field2084 >= this.field2083) {
                            var4 = this.field2084 - this.field2083;
                        } else {
                            var4 = 5000 - this.field2083;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2077.write(this.field2082, var3, var4);
                    } catch (IOException var12) {
                        this.field2085 = true;
                    }
                    this.field2083 = (this.field2083 + var4) % 5000;
                    try {
                        if (this.field2084 == this.field2083) {
                            this.field2077.flush();
                        }
                    } catch (IOException var11) {
                        this.field2085 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2081 != null) {
                        this.field2081.close();
                    }
                    if (this.field2077 != null) {
                        this.field2077.close();
                    }
                    if (this.field2076 != null) {
                        this.field2076.close();
                    }
                } catch (IOException var10) {
                }
                this.field2082 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method2571((String) null, var15);
        }
    }
}
