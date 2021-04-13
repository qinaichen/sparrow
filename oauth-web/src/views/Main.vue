<template>
	<div
		class="site-wrapper"
		:class="{ 'site-sidebar--fold': sidebarFold }"
		v-loading.fullscreen.lock="loading"
		element-loading-text="拼命加载中"
	>
		<template v-if="!loading">
			<main-navbar></main-navbar>
			<main-sidebar></main-sidebar>
			<div
				class="site-content__wrapper"
				:style="{ 'min-height': documentClientHeight + 'px' }"
			>
				<main-content />
			</div>
		</template>
	</div>
</template>

<script>
	import MainNavbar from "@/views/sub/main-navbar";
	import MainSidebar from "@/views/sub/main-sidebar";
	import MainContent from "@/views/sub/main-content";
	export default {
		name: "Home",
		components: {
			MainNavbar,
			MainSidebar,
			MainContent,
		},
		data() {
			return {
				loading: false,
			};
		},
		computed: {
			documentClientHeight: {
				get() {
					return this.$store.state.common.documentClientHeight;
				},
				set(val) {
					this.$store.commit("common/updateDocumentClientHeight", val);
				},
			},
			sidebarFold: {
				get() {
					return this.$store.state.common.sidebarFold;
				},
			},
			userId: {
				get() {
					return this.$store.state.user.id;
				},
				set(val) {
					this.$store.commit("user/updateId", val);
				},
			},
			userName: {
				get() {
					return this.$store.state.user.name;
				},
				set(val) {
					this.$store.commit("user/updateName", val);
				},
			},
		},
		methods: {
			resize() {},
		},
		mounted() {},
	};
</script>
<style scoped>
</style>
