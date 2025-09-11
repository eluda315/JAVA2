package week2_BattleRefac.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import week2_BattleRefac.player.Player;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Color;

public class Mywin extends JFrame {

	private JPanel contentPane;
	private JProgressBar bar1;
	private JProgressBar bar2;
	private JProgressBar bar3;
	private JLabel Label1;
	private JLabel Label2;
	private JLabel Label3;
	private JLabel Label4;
	private JLabel Label5;
	private JLabel Label6;
	private JLabel Label7;
	private JLabel Label8;
	private JProgressBar bar4;
	private JProgressBar bar5;
	private JProgressBar bar6;
	private JProgressBar bar7;
	private JProgressBar bar8;
	private JScrollPane scrollPane;
	public static JTextArea ta;
	private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JProgressBar bar11;
	private JProgressBar bar22;
	private JProgressBar bar33;
	private JProgressBar bar44;
	List<Player> players = new ArrayList<>();
	List<Player> heroes = new ArrayList<>();
	List<JButton> heroButtons = new ArrayList<>();
	Player p1, p2, p3, p4, p5, p6, p7, p8;
	Player chosen;
	int currentPlayerIndex = 0;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mywin frame = new Mywin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public Mywin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		this.setVisible(true);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		Label1 = new JLabel("");
		Label1.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uB1781.jpg")));
		Label1.setHorizontalAlignment(SwingConstants.CENTER);
		Label1.setBounds(22, 44, 93, 136);
		contentPane.add(Label1);

		btn1 = new JButton("치료하기");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					heroAttack(p1, Label1, "/week2_BattleRefac/image/노2.jpg", "/week2_BattleRefac/image/노3.jpg", "/week2_BattleRefac/image/노4.jpg", bar1,btn1,bar11);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn1.setBounds(22, 285, 93, 23);
		contentPane.add(btn1);

		bar1 = new JProgressBar();
		bar1.setMaximum(23);
		bar1.setForeground(Color.RED);
		bar1.setBounds(10, 252, 116, 23);
		contentPane.add(bar1);

		Label2 = new JLabel("");
		Label2.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uAD111.jpg")));
		Label2.setHorizontalAlignment(SwingConstants.CENTER);
		Label2.setBounds(146, 44, 93, 136);
		contentPane.add(Label2);

		btn2 = new JButton("치료하기");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					heroAttack(p2, Label2, "/week2_BattleRefac/image/광2.jpg", "/week2_BattleRefac/image/광3.jpg", "/week2_BattleRefac/image/광4.jpg", bar2,btn2,bar22);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn2.setBounds(146, 285, 93, 23);
		contentPane.add(btn2);

		bar2 = new JProgressBar();
		bar2.setMaximum(19);
		bar2.setForeground(Color.RED);
		bar2.setBounds(136, 252, 116, 23);
		contentPane.add(bar2);

		Label3 = new JLabel("");
		Label3.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uC1311.jpg")));
		Label3.setHorizontalAlignment(SwingConstants.CENTER);
		Label3.setBounds(272, 44, 93, 136);
		contentPane.add(Label3);

		btn3 = new JButton("치료하기");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					heroAttack(p3, Label3, "/week2_BattleRefac/image/성2.jpg", "/week2_BattleRefac/image/성3.jpg", "/week2_BattleRefac/image/성4.jpg", bar3,btn3,bar33);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn3.setBounds(272, 285, 93, 23);
		contentPane.add(btn3);

		bar3 = new JProgressBar();
		bar3.setForeground(Color.RED);
		bar3.setMaximum(24);
		bar3.setBounds(262, 252, 116, 23);
		contentPane.add(bar3);

		Label4 = new JLabel("");
		Label4.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uAE301.jpg")));
		Label4.setHorizontalAlignment(SwingConstants.CENTER);
		Label4.setBounds(398, 44, 93, 136);
		contentPane.add(Label4);

		btn4 = new JButton("치료하기");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					heroAttack(p4, Label4, "/week2_BattleRefac/image/기2.jpg", "/week2_BattleRefac/image/기3.jpg", "/week2_BattleRefac/image/기4.jpg", bar4,btn4,bar44);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btn4.setBounds(398, 285, 93, 23);
		contentPane.add(btn4);

		bar4 = new JProgressBar();
		bar4.setForeground(Color.RED);
		bar4.setMaximum(33);
		bar4.setBounds(388, 252, 116, 23);
		contentPane.add(bar4);

		Label5 = new JLabel("");
		Label5.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uBCD11.jpg")));
		Label5.setHorizontalAlignment(SwingConstants.CENTER);
		Label5.setBounds(597, 44, 93, 136);
		contentPane.add(Label5);

		btn5 = new JButton("공격하기");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monsterAttack(p5, Label5, "/week2_BattleRefac/image/병2.jpg", bar5,btn5);
			}
		});
		btn5.setBounds(597, 285, 93, 23);
		contentPane.add(btn5);

		bar5 = new JProgressBar();
		bar5.setForeground(Color.RED);
		bar5.setMaximum(20);
		bar5.setBounds(585, 252, 116, 23);
		contentPane.add(bar5);

		Label6 = new JLabel("");
		Label6.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uBCD11.jpg")));
		Label6.setHorizontalAlignment(SwingConstants.CENTER);
		Label6.setBounds(723, 44, 93, 136);
		contentPane.add(Label6);

		btn6 = new JButton("공격하기");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monsterAttack(p6, Label6, "/week2_BattleRefac/image/병2.jpg", bar6,btn6);
			}
		});
		btn6.setBounds(723, 285, 93, 23);
		contentPane.add(btn6);

		bar6 = new JProgressBar();
		bar6.setForeground(Color.RED);
		bar6.setMaximum(20);
		bar6.setBounds(711, 252, 116, 23);
		contentPane.add(bar6);

		Label7 = new JLabel("");
		Label7.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uBCF41.jpg")));
		Label7.setHorizontalAlignment(SwingConstants.CENTER);
		Label7.setBounds(849, 44, 93, 136);
		contentPane.add(Label7);

		bar7 = new JProgressBar();
		bar7.setMaximum(15);
		bar7.setForeground(Color.RED);
		bar7.setBounds(837, 252, 116, 23);
		contentPane.add(bar7);

		btn7 = new JButton("공격하기");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monsterAttack(p7, Label7, "/week2_BattleRefac/image/보2.jpg", bar7,btn7);
			}
		});
		btn7.setBounds(849, 285, 93, 23);
		contentPane.add(btn7);

		Label8 = new JLabel("");
		Label8.setIcon(new ImageIcon(Mywin.class.getResource("/week2_BattleRefac/image/\uC11D1.jpg")));
		Label8.setHorizontalAlignment(SwingConstants.CENTER);
		Label8.setBounds(974, 44, 93, 136);
		contentPane.add(Label8);

		bar8 = new JProgressBar();
		bar8.setForeground(Color.RED);
		bar8.setMaximum(15);
		bar8.setBounds(962, 252, 116, 23);
		contentPane.add(bar8);

		btn8 = new JButton("공격하기");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				monsterAttack(p8, Label8, "/week2_BattleRefac/image/석2.jpg", bar8,btn8);
			}
		});
		btn8.setBounds(974, 285, 93, 23);
		contentPane.add(btn8);

		scrollPane = new JScrollPane();
		scrollPane.setBounds(249, 334, 581, 221);
		contentPane.add(scrollPane);

		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		bar11 = new JProgressBar();
		bar11.setForeground(Color.GRAY);
		bar11.setMaximum(50);
		bar11.setBounds(10, 211, 116, 23);
		contentPane.add(bar11);
		
		bar22 = new JProgressBar();
		bar22.setMaximum(50);
		bar22.setForeground(Color.GRAY);
		bar22.setBounds(136, 211, 116, 23);
		contentPane.add(bar22);
		
		bar33 = new JProgressBar();
		bar33.setMaximum(50);
		bar33.setForeground(Color.GRAY);
		bar33.setBounds(262, 211, 116, 23);
		contentPane.add(bar33);
		
		bar44 = new JProgressBar();
		bar44.setMaximum(50);
		bar44.setForeground(Color.GRAY);
		bar44.setBounds(388, 211, 116, 23);
		contentPane.add(bar44);
		
		
		bar11.setValue(0);
		bar22.setValue(0);
		bar33.setValue(0);
		bar44.setValue(0);
	}

	public Mywin(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8) {
		this();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
		this.p4 = p4;
		this.p5 = p5;
		this.p6 = p6;
		this.p7 = p7;
		this.p8 = p8;
		// 플레이어의 이미지,hp를 해당 컴포넌트에 세팅

		bar1.setValue(p1.hp);
		bar2.setValue(p2.hp);
		bar3.setValue(p3.hp);
		bar4.setValue(p4.hp);
		bar5.setValue(p5.hp);
		bar6.setValue(p6.hp);
		bar7.setValue(p7.hp);
		bar8.setValue(p8.hp);
		
		

		setPlayers(p1, p2, p3, p4, p5, p6, p7, p8, btn1, btn2, btn3, btn4);
		runStage();

	}

	public void runStage() {
		playerSort();
		chosen = players.get(0);
		if (chosen.equals(p1) || chosen.equals(p4)) {
			System.out.printf("%s의 턴입니다. 공격할 대상을 고르십시오.", chosen.name);
			System.out.println();
			String str= chosen.name+"의 턴입니다. 공격할 대상을 고르십시오.\n";
			ta.append(str);
		}
		else if (chosen.equals(p3)) {
			System.out.println("성녀가 치료할 대상을 고르십시오.");
			String str= "성녀가 치료할 대상을 고르십시오.\n";
			ta.append(str);
		}
		else if (chosen.equals(p2)) {
			System.out.println("광대가 연주해줄 대상을 고르십시오.");
			String str= "광대가 연주해줄 대상을 고르십시오.\n";
			ta.append(str);
		}
		else {
			// 몬스터가 영웅들을 랜덤으로 공격하도록 만들기(자동) 살아있는 영웅들만 공격하게 해야하는데..
			// 여기에도 만들고 heroAttack이랑 monsterAttack에도 만들어야 할 듯.. 계속 이어지게
			// 이건 낼할래
			heroes.removeIf(player -> player.hp <= 0);
			Random rand = new Random();
			int r = rand.nextInt(heroes.size());
			heroButtons.get(r).doClick();

		}
	}

	public void setPlayers(Player p1, Player p2, Player p3, Player p4, Player p5, Player p6, Player p7, Player p8,
			JButton btn1, JButton btn2, JButton btn3, JButton btn4) {
		players.add(p1);
		players.add(p2);
		players.add(p3);
		players.add(p4);
		players.add(p5);
		players.add(p6);
		players.add(p7);
		players.add(p8);
		heroes.add(p1);
		heroButtons.add(btn1);
		heroes.add(p2);
		heroButtons.add(btn2);
		heroes.add(p3);
		heroButtons.add(btn3);
		heroes.add(p4);
		heroButtons.add(btn4);
	}

	public void playerSort() {
		// hp0보다 작으면 players에서 지우기
		players.removeIf(player -> player.hp <= 0);
		if(players.size()==0) {
			try {
				checkForWinner();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		else {
			// dice에 0~8 랜덤으로 넣어두기
			for (int i = 0; i < players.size(); i++) {
				players.get(i).dice = (int) (Math.random() * 1000) % 9;
			}
			// dice+speed 값에 따라 내림차순으로
			for (int i = 0; i < players.size() - 1; i++) {
				for (int j = 0; j < players.size() - 1 - i; j++) {
					if ((players.get(j).dice + players.get(j).speed) < (players.get(j + 1).dice
							+ players.get(j + 1).speed)) {
						Player temp = players.get(j);
						players.set(j, players.get(j + 1));
						players.set(j + 1, temp);
					}
				}
			}
		}

	}

	public void heroAttack(Player pa, JLabel Label, String imageName, String image1, String image2, JProgressBar bar,JButton btn,JProgressBar bar0) throws InterruptedException {
		if (pa.hp <= 0) {
			System.out.println("선택한 대상은 이미 사망하였습니다. 다시 선택하십시오.");
			String str= "선택한 대상은 이미 사망하였습니다. 다시 선택하십시오.\n";
			ta.append(str);
		}
		else {
			if (chosen == p1 || chosen == p4) {
				System.out.println("아군을 공격할 수 없습니다! 다시 선택하십시오.");
				String str= "아군을 공격할 수 없습니다! 다시 선택하십시오.\n";
				ta.append(str);
			} 
			else {
				if (chosen.equals(p3)) {
					chosen.attack(pa);
					bar.setValue(pa.hp);
					bar0.setValue(pa.stress);
					currentPlayerIndex++;
					if (currentPlayerIndex >= players.size()) {
						currentPlayerIndex = 0;
						runStage();
					} else {
						chosen = players.get(currentPlayerIndex);
						if (chosen.equals(p1) || chosen.equals(p4)) {
							System.out.printf("%s의 턴입니다. 공격할 대상을 고르십시오.", chosen.name);
							System.out.println();
							String str= chosen.name+"의 턴입니다. 공격할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p3)) {
							System.out.println("성녀가 치료할 대상을 고르십시오.");
							String str= "성녀가 치료할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p2)) {
							System.out.println("광대가 연주해줄 대상을 고르십시오.");
							String str= "광대가 연주해줄 대상을 고르십시오.\n";
							ta.append(str);
						}
						else {
							heroes.removeIf(player -> player.hp <= 0);
							Random rand = new Random();
							int r = rand.nextInt(heroes.size());
							heroButtons.get(r).doClick();
						}
					}
				} else if (chosen.equals(p2)) {
					chosen.attack(pa);
					bar.setValue(pa.hp);
					bar0.setValue(pa.stress);
					currentPlayerIndex++;
					if (currentPlayerIndex >=players.size()) {
						currentPlayerIndex = 0;
						runStage();
						// index가 다시 0될때=스테이지 하나 끝났을 때 어케할지 해결하기
					} else {
						chosen = players.get(currentPlayerIndex);
						if (chosen.equals(p1) || chosen.equals(p4)) {
							System.out.printf("%s의 턴입니다. 공격할 대상을 고르십시오.", chosen.name);
							System.out.println();
							String str= chosen.name+"의 턴입니다. 공격할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p3)) {
							System.out.println("성녀가 치료할 대상을 고르십시오.");
							String str= "성녀가 치료할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p2)) {
							System.out.println("광대가 연주해줄 대상을 고르십시오.");
							String str= "광대가 연주해줄 대상을 고르십시오.\n";
							ta.append(str);
						}
						else {
							heroes.removeIf(player -> player.hp <= 0);
							Random rand = new Random();
							int r = rand.nextInt(heroes.size());
							heroButtons.get(r).doClick();
						}
					}
				} else {
					chosen.attack(pa);
					bar.setValue(pa.hp);
					bar0.setValue(pa.stress);
					currentPlayerIndex++;
					Thread.sleep(1000);
					if (pa.hp <= 0) {
						bar.setValue(0);
						System.out.printf("%s가 사망했습니다.", pa.name);
						System.out.println();
						String str= pa.name+"가 사망했습니다.\n";
						ta.append(str);
						btn.setEnabled(false);
						Label.setIcon(new ImageIcon(Mywin.class.getResource(imageName)));
					} else {
						chosen.playerStress(pa, Label, image1, image2);
						bar0.setValue(pa.stress);
						if (pa.hp <= 0) {
							bar.setValue(0);
							System.out.printf("%s가 사망했습니다.", pa.name);
							System.out.println();
							String str= pa.name+"가 사망했습니다.\n";
							ta.append(str);
							btn.setEnabled(false);
							Label.setIcon(new ImageIcon(Mywin.class.getResource(imageName)));
						}
					}
					checkForWinner();
					if (currentPlayerIndex>= players.size()) {
						currentPlayerIndex = 0;
						runStage();
					} else {
						chosen = players.get(currentPlayerIndex);
						if (chosen.equals(p1) || chosen.equals(p4)) {
							System.out.printf("%s의 턴입니다. 공격할 대상을 고르십시오.", chosen.name);
							System.out.println();
							String str= chosen.name+"의 턴입니다. 공격할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p3)) {
							System.out.println("성녀가 치료할 대상을 고르십시오.");
							String str= "성녀가 치료할 대상을 고르십시오.\n";
							ta.append(str);
						}
						else if (chosen.equals(p2)) {
							System.out.println("광대가 연주해줄 대상을 고르십시오.");
							String str= "광대가 연주해줄 대상을 고르십시오.\n";
							ta.append(str);
						}
						else {
							heroes.removeIf(player -> player.hp <= 0);
							Random rand = new Random();
							int r = rand.nextInt(heroes.size());
							heroButtons.get(r).doClick();
						}
					}
				}
			}
		}

	}

	public void monsterAttack(Player pa, JLabel Label, String imageName, JProgressBar bar,JButton btn) {
		if(pa.hp<=0) {
			System.out.println("선택한 대상은 이미 사망하였습니다. 다시 선택하십시오.");
			String str= "선택한 대상은 이미 사망하였습니다. 다시 선택하십시오.\n";
			ta.append(str);
		}
		else {
			if (chosen == p2 || chosen == p3) {
				System.out.println("적군을 치료할 수 없습니다! 다시 선택하십시오.");
				String str= "적군을 치료할 수 없습니다! 다시 선택하십시오.\n";
				ta.append(str);
			} else {
				chosen.attack(pa);
				bar.setValue(pa.hp);
				currentPlayerIndex++;
	
				if (pa.hp <= 0) {
					bar.setValue(0);
					System.out.printf("%s가 사망했습니다.", pa.name);
					System.out.println();
					String str= pa.name+"가 사망했습니다.\n";
					ta.append(str);
					btn.setEnabled(false);
					Label.setIcon(new ImageIcon(Mywin.class.getResource(imageName)));
				}
				try {
					checkForWinner();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				if (currentPlayerIndex>= players.size()) {
					currentPlayerIndex = 0;
					runStage();
				} else {
					chosen = players.get(currentPlayerIndex);
					if (chosen.equals(p1) || chosen.equals(p4)) {
						System.out.printf("%s의 턴입니다. 공격할 대상을 고르십시오.", chosen.name);
						System.out.println();
						String str= chosen.name+"의 턴입니다. 공격할 대상을 고르십시오.\n";
						ta.append(str);
					}
					else if (chosen.equals(p3)) {
						System.out.println("성녀가 치료할 대상을 고르십시오.");
						String str= "성녀가 치료할 대상을 고르십시오.\n";
						ta.append(str);
					}
					else if (chosen.equals(p2)) {
						System.out.println("광대가 연주해줄 대상을 고르십시오.");
						String str= "광대가 연주해줄 대상을 고르십시오.\n";
						ta.append(str);
					}
					else {
						heroes.removeIf(player -> player.hp <= 0);
						Random rand = new Random();
						int r = rand.nextInt(heroes.size());
						heroButtons.get(r).doClick();
					}
				}
			}
		}
	}

	public void checkForWinner() throws InterruptedException {
		// 게임이 끝났는지 확인
		if(p1.hp<=0&&p2.hp<=0&&p3.hp<=0&&p4.hp<=0) {
			JOptionPane.showMessageDialog(null, "Monsters 승!!", "게임 끝", JOptionPane.PLAIN_MESSAGE);
			Thread.sleep(2000);
			System.exit(0);
		}
		else if(p5.hp<=0&&p6.hp<=0&&p7.hp<=0&&p8.hp<=0) {
			JOptionPane.showMessageDialog(null, "Heroes 승!!", "게임 끝", JOptionPane.PLAIN_MESSAGE);
			Thread.sleep(2000);
			System.exit(0);
		}
	}
	
	public JButton getBtn1() {
        return btn1;
    }

    public JButton getBtn2() {
        return btn2;
    }

    public JButton getBtn3() {
        return btn3;
    }

    public JButton getBtn4() {
        return btn4;
    }
}
