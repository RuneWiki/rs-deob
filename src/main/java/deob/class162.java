package deob;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

@ObfuscatedName("fh")
public final class class162 extends class158 implements Runnable {

    @ObfuscatedName("fh.w")
    public InputStream field2018;

    @ObfuscatedName("fh.m")
    public OutputStream field2016;

    @ObfuscatedName("fh.q")
    public Socket field2023;

    @ObfuscatedName("fh.b")
    public boolean field2013 = false;

    @ObfuscatedName("fh.f")
    public class155 field2011;

    @ObfuscatedName("fh.n")
    public class154 field2015;

    @ObfuscatedName("fh.h")
    public byte[] field2012;

    @ObfuscatedName("fh.x")
    public int field2017 = 0;

    @ObfuscatedName("fh.j")
    public int field2010 = 0;

    @ObfuscatedName("fh.a")
    public boolean field2019 = false;

    @ObfuscatedName("fh.l")
    public final int field2020;

    @ObfuscatedName("fh.d")
    public final int field2021;

    public class162(Socket arg0, class155 arg1, int arg2) throws IOException {
        this.field2011 = arg1;
        this.field2023 = arg0;
        this.field2020 = arg2;
        this.field2021 = arg2 - 100;
        this.field2023.setSoTimeout(30000);
        this.field2023.setTcpNoDelay(true);
        this.field2023.setReceiveBufferSize(65536);
        this.field2023.setSendBufferSize(65536);
        this.field2018 = this.field2023.getInputStream();
        this.field2016 = this.field2023.getOutputStream();
    }

    @ObfuscatedName("fh.l(I)V")
    public void method3043() {
        if (this.field2013) {
            return;
        }
        synchronized (this) {
            this.field2013 = true;
            this.notifyAll();
        }
        if (this.field2015 != null) {
            while (this.field2015.field1967 == 0) {
                class192.method196(1L);
            }
            if (this.field2015.field1967 == 1) {
                try {
                    ((Thread) this.field2015.field1971).join();
                } catch (InterruptedException var4) {
                }
            }
        }
        this.field2015 = null;
    }

    public void finalize() {
        this.method3043();
    }

    @ObfuscatedName("fh.x(I)I")
    public int method3040() throws IOException {
        return this.field2013 ? 0 : this.field2018.read();
    }

    @ObfuscatedName("fh.q(I)I")
    public int method3037() throws IOException {
        return this.field2013 ? 0 : this.field2018.available();
    }

    @ObfuscatedName("fh.m(II)Z")
    public boolean method3038(int arg0) throws IOException {
        if (this.field2013) {
            return false;
        } else {
            return this.field2018.available() >= arg0;
        }
    }

    @ObfuscatedName("fh.j([BIII)I")
    public int method3041(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2013) {
            return 0;
        }
        int var4 = arg2;
        while (arg2 > 0) {
            int var5 = this.field2018.read(arg0, arg1, arg2);
            if (var5 <= 0) {
                throw new EOFException();
            }
            arg1 += var5;
            arg2 -= var5;
        }
        return var4;
    }

    @ObfuscatedName("fh.ag([BIII)V")
    public void method3082(byte[] arg0, int arg1, int arg2) throws IOException {
        if (this.field2013) {
            return;
        }
        if (this.field2019) {
            this.field2019 = false;
            throw new IOException();
        }
        if (this.field2012 == null) {
            this.field2012 = new byte[this.field2020];
        }
        synchronized (this) {
            for (int var5 = 0; var5 < arg2; var5++) {
                this.field2012[this.field2010] = arg0[arg1 + var5];
                this.field2010 = (this.field2010 + 1) % this.field2020;
                if ((this.field2021 + this.field2017) % this.field2020 == this.field2010) {
                    throw new IOException();
                }
            }
            if (this.field2015 == null) {
                this.field2015 = this.field2011.method3011(this, 3);
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
                        if (this.field2017 == this.field2010) {
                            if (this.field2013) {
                                break label84;
                            }
                            try {
                                this.wait();
                            } catch (InterruptedException var13) {
                            }
                        }
                        var3 = this.field2017;
                        if (this.field2010 >= this.field2017) {
                            var4 = this.field2010 - this.field2017;
                        } else {
                            var4 = this.field2020 - this.field2017;
                        }
                    }
                    if (var4 <= 0) {
                        continue;
                    }
                    try {
                        this.field2016.write(this.field2012, var3, var4);
                    } catch (IOException var12) {
                        this.field2019 = true;
                    }
                    this.field2017 = (this.field2017 + var4) % this.field2020;
                    try {
                        if (this.field2017 == this.field2010) {
                            this.field2016.flush();
                        }
                    } catch (IOException var11) {
                        this.field2019 = true;
                    }
                    continue;
                }
                try {
                    if (this.field2018 != null) {
                        this.field2018.close();
                    }
                    if (this.field2016 != null) {
                        this.field2016.close();
                    }
                    if (this.field2023 != null) {
                        this.field2023.close();
                    }
                } catch (IOException var10) {
                }
                this.field2012 = null;
                break;
            }
        } catch (Exception var15) {
            class153.method695((String) null, var15);
        }
    }

    @ObfuscatedName("fh.a([BIII)V")
    public void method3042(byte[] arg0, int arg1, int arg2) throws IOException {
        this.method3082(arg0, arg1, arg2);
    }
}
