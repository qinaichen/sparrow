<template>
	<el-container>
		<el-header class="header">
			<el-row type="flex" justify="space-between">
				<el-col :span="4">
					<h1 class="title">基础平台</h1>
				</el-col>
				<el-col :span="2">
					<span>个人信息</span>
				</el-col>
			</el-row>
		</el-header>
		<el-container>
			<el-aside width="200px">
				<el-menu
					default-active="2"
					class="el-menu-vertical-demo"
					@open="handleOpen"
					@close="handleClose"
					background-color="#001529"
					text-color="#fff"
					active-text-color="#ffd04b"
					:style="{height:sideHeight}"
				>
					<el-submenu index="1">
						<template slot="title">
							<i class="el-icon-location"></i>
							<span>导航一</span>
						</template>
						<el-menu-item-group>
							<template slot="title">分组一</template>
							<el-menu-item index="1-1">选项1</el-menu-item>
							<el-menu-item index="1-2">选项2</el-menu-item>
						</el-menu-item-group>
						<el-menu-item-group title="分组2">
							<el-menu-item index="1-3">选项3</el-menu-item>
						</el-menu-item-group>
						<el-submenu index="1-4">
							<template slot="title">选项4</template>
							<el-menu-item index="1-4-1">选项1</el-menu-item>
						</el-submenu>
					</el-submenu>
					<el-menu-item index="2">
						<i class="el-icon-menu"></i>
						<span slot="title">导航二</span>
					</el-menu-item>
					<el-menu-item index="3" disabled>
						<i class="el-icon-document"></i>
						<span slot="title">导航三</span>
					</el-menu-item>
					<el-menu-item index="4">
						<i class="el-icon-setting"></i>
						<span slot="title">导航四</span>
					</el-menu-item>
				</el-menu>
			</el-aside>
			<el-main>Main</el-main>
		</el-container>
	</el-container>
</template>

<script>
	export default {
		name: "Home",
		components: {},
		data() {
			return {
				sideHeight: document.documentElement.clientHeight - 60 + "px",
			};
		},
		methods: {
			handleOpen(key, keyPath) {
				console.log(key, keyPath);
			},
			handleClose(key, keyPath) {
				console.log(key, keyPath);
			},
		},
	};
</script>

<style>
	.header {
		background-color: #001529;
		color: #fff;
		line-height: 60px;
	}
	.title {
		color: #fff;
		font-size: 20px;
		margin: 0 0 0 12px;
		font-family: Avenir, Helvetica Neue, Arial, Helvetica, sans-serif;
		font-weight: 600;
		vertical-align: middle;
	}
</style>
