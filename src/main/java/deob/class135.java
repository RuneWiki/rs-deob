package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("ep")
public final class class135 implements Runnable {

    @ObfuscatedName("ep.b")
    public InputStream field2078;

    @ObfuscatedName("ep.e")
    public OutputStream field2079;

    @ObfuscatedName("ep.a")
    public Socket field2080;

    @ObfuscatedName("ep.k")
    public boolean field2081 = false;

    @ObfuscatedName("ep.p")
    public class128 field2082;

    @ObfuscatedName("ep.l")
    public class138 field2083;

    @ObfuscatedName("ep.u")
    public byte[] field2084;

    @ObfuscatedName("ep.o")
    public int field2085 = 0;

    @ObfuscatedName("ep.m")
    public int field2086 = 0;

    @ObfuscatedName("ep.q")
    public boolean field2087 = false;

    public class135(Socket arg0, class128 arg1) throws IOException {
        this.field2082 = arg1;
        this.field2080 = arg0;
        this.field2080.setSoTimeout(30000);
        this.field2080.setTcpNoDelay(true);
        this.field2078 = this.field2080.getInputStream();
        this.field2079 = this.field2080.getOutputStream();
    }

    @ObfuscatedName("ep.a(I)V")
    public void method2589() {
        if (this.field2081) {
            return;
        }
        synchronized (this) {
            this.field2081 = true;
            this.notifyAll();
        }
        if (this.field2083 != null) {
            while (this.field2083.field2116 == 0) {
                class119.method555(1L);
            }
            if (this.field2083.field2116 == 1) {
                try {
                    ((Thread) this.field2083.field2115).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2083 = null;
    }

    public void finalize() {
        this.method2589();
    }

    @ObfuscatedName("ep.k(I)I")
    public int method2590() throws IOException {
        return this.field2081 ? 0 : this.field2078.read();
    }

    @ObfuscatedName("ep.p(B)I")
    public int method2591() throws IOException {
        return this.field2081 ? 0 : this.field2078.available();
    }

    @ObfuscatedName("ep.l([BIII)V")
    public void method2613(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2081) {
            return;
        }
        while (arg2 > 0) {
            int var4 = this.field2078.read(arg0, arg1, arg2);
            if (var4 <= 0) {
                throw new EOFException();
            }
            arg1 += var4;
            arg2 -= var4;
        }
    }

    @ObfuscatedName("ep.u([BIII)V")
    public void method2593(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2081) {
            return;
        }
        if (this.field2087) {
            this.field2087 = false;
            throw new IOException();
        }
        if (this.field2084 == null) {
            this.field2084 = new byte[5000];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2084[this.field2086] = arg0[arg1 + var5];
                this.field2086 = (this.field2086 + 1) % 5000;
                if ((this.field2085 + 4900) % 5000 == this.field2086) {
                    throw new IOException();
                }
            }
            if (this.field2083 == null) {
                this.field2083 = this.field2082.method2507(this, 3);
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
                        if (this.field2086 == this.field2085) {
                            if (this.field2081) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2085;
                        if (this.field2086 >= this.field2085) {
                            var4 = this.field2086 - this.field2085;
                        } else {
                            var4 = 5000 - this.field2085;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2079.write(this.field2084, var3, var4);
                    } catch (IOException var12) {
                        this.field2087 = true;
                    }
                    this.field2085 = (this.field2085 + var4) % 5000;
                    try {
                        if (this.field2086 == this.field2085) {
                            this.field2079.flush();
                        }
                    } catch (IOException var11) {
                        this.field2087 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2078 != null) {
                        this.field2078.close();
                    }
                    if (this.field2079 != null) {
                        this.field2079.close();
                    }
                    if (this.field2080 != null) {
                        this.field2080.close();
                    }
                } catch (IOException var10) {
                }
                this.field2084 = null;
                break;
            }
        } catch (Exception var15) {
            class140.method2489((String) null, var15);
        }
    }
}
